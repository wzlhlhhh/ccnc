package com.ccnc.bean;

// 公告信息
public class Notice {
    // 公告的主题、内容、更新时间、浏览量、公告类型、发布者ID
    private Integer id;
    private String title;
    private String content;
    private String update_time;
    private int views;
    private String type;
    private int user_id;

    public Notice() {
    }

    public Notice(String title, String content, String update_time, int views, String type, int user_id) {
        this.title = title;
        this.content = content;
        this.update_time = update_time;
        this.views = views;
        this.type = type;
        this.user_id = user_id;
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

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", update_time='" + update_time + '\'' +
                ", views=" + views +
                ", type='" + type + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
