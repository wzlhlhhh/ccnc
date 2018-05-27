package com.ccnc.controller;

import com.ccnc.MD5.MD5;
import com.ccnc.bean.User;
import com.ccnc.service.LoginService;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/*
登陆控制器
 */

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public ModelAndView index(RedirectAttributes redirectAttributes) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login.html");
        return mv;
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(User user, HttpSession session, RedirectAttributes redirectAttributes) throws NoSuchAlgorithmException,UnsupportedEncodingException
    {
        // 1.检查用户输入
        if(user.getUsername().length() < 1 || user.getPassword().length() < 1)
        {
            redirectAttributes.addFlashAttribute("msg", "用户名/密码异常！");
            return "redirect:/";
        }
       // 检查是否有此用户
        user.setPassword( MD5.getMD5(user.getPassword()) );
        User cur_user = loginService.login(user);
        System.out.println(loginService.login(user));
        if(cur_user.getId() > 0)
        {
            session.setAttribute("user", user.getUsername());
            session.setAttribute("role", user.getRole());
            return "redirect:/welcome";
        }
        else
        {
            redirectAttributes.addFlashAttribute("msg", "用户名/密码错误！");
            return "redirect:/";
        }
    }

    @RequestMapping("/welcome")
    public String welcome(RedirectAttributes redirectAttributes)
    {
        return "/index.html";
    }

}
