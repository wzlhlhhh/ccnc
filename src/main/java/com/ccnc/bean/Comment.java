package com.ccnc.bean;

// 评论信息
public class Comment {
    // 评论者ID、评论对象、评论内容、评论时间、星级评分、评论状态
    private Integer id;
    private int user_id;
    private String object;
    private String content;
    private String comment_time;
    private float star;
    private int statu;

    public Comment() {
    }

    public Comment(int user_id, String object, String content, String comment_time, float star, int statu) {
        this.user_id = user_id;
        this.object = object;
        this.content = content;
        this.comment_time = comment_time;
        this.star = star;
        this.statu = statu;
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

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", object='" + object + '\'' +
                ", content='" + content + '\'' +
                ", comment_time='" + comment_time + '\'' +
                ", star=" + star +
                ", statu=" + statu +
                '}';
    }
}

