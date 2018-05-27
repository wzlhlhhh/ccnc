package com.ccnc.bean;

// 消息推送的消息
public class Message {
    // 包括消息的标题、内容、修改人ID、修改时间、状态、推送对象
    private Integer id;
    private String title;
    private String content;
    private int change_id;
    private String change_time;
    private int statu;
    private String to_id;

    public Message() {
    }

    public Message(String title, String content, int change_id, String change_time, int statu, String to_id) {
        this.title = title;
        this.content = content;
        this.change_id = change_id;
        this.change_time = change_time;
        this.statu = statu;
        this.to_id = to_id;
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

    public int getChange_id() {
        return change_id;
    }

    public void setChange_id(int change_id) {
        this.change_id = change_id;
    }

    public String getChange_time() {
        return change_time;
    }

    public void setChange_time(String change_time) {
        this.change_time = change_time;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public String getTo_id() {
        return to_id;
    }

    public void setTo_id(String to_id) {
        this.to_id = to_id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", change_id=" + change_id +
                ", change_time='" + change_time + '\'' +
                ", statu=" + statu +
                ", to_id='" + to_id + '\'' +
                '}';
    }
}

