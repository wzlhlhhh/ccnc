package com.ccnc.bean;

// 用户土地关联信息
public class UserLand {
    // 用户ID、拥有土地ID、租用起始时间
    private Integer id;
    private int user_id;
    private int land_id;
    private String start_time;
    private String end_time;

    public UserLand() {
    }

    public UserLand(int user_id, int land_id, String start_time, String end_time) {
        this.user_id = user_id;
        this.land_id = land_id;
        this.start_time = start_time;
        this.end_time = end_time;
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

    public int getLand_id() {
        return land_id;
    }

    public void setLand_id(int land_id) {
        this.land_id = land_id;
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

    @Override
    public String toString() {
        return "UserLand{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", land_id=" + land_id +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                '}';
    }
}
