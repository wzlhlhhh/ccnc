package com.ccnc.bean;

// 活动信息
public class Activity {
    // 活动的主题、内容、起止时间、状态、简介
    private Integer id;
    private String title;
    private String content;
    private String start_time;
    private String end_time;
    private int statu;
    private String abs;

    public Activity() {
    }

    public Activity(String title, String content, String start_time, String end_time, int statu, String abs) {
        this.title = title;
        this.content = content;
        this.start_time = start_time;
        this.end_time = end_time;
        this.statu = statu;
        this.abs = abs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", statu=" + statu +
                ", abs='" + abs + '\'' +
                '}';
    }
}
