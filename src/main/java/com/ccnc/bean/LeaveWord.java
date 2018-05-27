package com.ccnc.bean;

// 留言信息
public class LeaveWord {
    // 留言者的ID、留言内容、留言时间、留言状态、回复者、回复时间
    private Integer id;
    private int user_id;
    private String content;
    private String word_time;
    private int statu;
    private String answer;
    private String reply_time;

    public LeaveWord() {
    }

    public LeaveWord(int user_id, String content, String word_time, int statu, String answer, String reply_time) {
        this.user_id = user_id;
        this.content = content;
        this.word_time = word_time;
        this.statu = statu;
        this.answer = answer;
        this.reply_time = reply_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWord_time() {
        return word_time;
    }

    public void setWord_time(String word_time) {
        this.word_time = word_time;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getReply_time() {
        return reply_time;
    }

    public void setReply_time(String reply_time) {
        this.reply_time = reply_time;
    }

    @Override
    public String toString() {
        return "LeaveWord{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", content='" + content + '\'' +
                ", word_time='" + word_time + '\'' +
                ", statu=" + statu +
                ", answer='" + answer + '\'' +
                ", reply_time='" + reply_time + '\'' +
                '}';
    }
}


