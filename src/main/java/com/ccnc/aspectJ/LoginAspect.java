package com.ccnc.aspectJ;

import com.sun.deploy.net.HttpUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Enumeration;


// 登录的日志记录
// 记得加@Configuration，才吃得到BUFF
@Aspect
@Configuration
public class LoginAspect {

    @Pointcut("execution(* com.ccnc.controller.LoginController.*(..))")//要处理的方法，包名+类名+方法名
    public void login(){
    }
    
    @After("execution(* com.ccnc.controller.LoginController.welcome(..))")
    public void user_login()  {
        HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        System.out.println("登录用户:"+ session.getAttribute("user"));
        String filePath = "d:/菜菜农场/loginlog/"+session.getAttribute("user")+".txt";
        try {
            RandomAccessFile rf = new RandomAccessFile(filePath, "rw");
            // 文件长度，字节数
            long fileLength = rf.length();
            // 将写文件指针移到文件尾。
            rf.seek(fileLength);
            rf.writeBytes("login_user:"+ session.getAttribute("user")+"\r\n");
            rf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
