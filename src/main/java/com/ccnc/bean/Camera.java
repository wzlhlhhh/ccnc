package com.ccnc.bean;

// 摄像头
public class Camera {
    // 摄像头的所属基地、序号、监控区域、启用时间、检修时间、状态、管理员ID
    private Integer id;
    private int landgroup_id;
    private int num;
    private String area;
    private String use_time;
    private String check_time;
    private int statu;
    private int admin_id;

    public Camera() {
    }

    public Camera(int landgroup_id, int num, String area, String use_time, String check_time, int statu, int admin_id) {
        this.landgroup_id = landgroup_id;
        this.num = num;
        this.area = area;
        this.use_time = use_time;
        this.check_time = check_time;
        this.statu = statu;
        this.admin_id = admin_id;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLandgroup_id() {
        return landgroup_id;
    }

    public void setLandgroup_id(int landgroup_id) {
        this.landgroup_id = landgroup_id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", landgroup_id=" + landgroup_id +
                ", num=" + num +
                ", area='" + area + '\'' +
                ", use_time='" + use_time + '\'' +
                ", check_time='" + check_time + '\'' +
                ", statu=" + statu +
                ", admin_id=" + admin_id +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getUse_time() {
        return use_time;
    }

    public void setUse_time(String use_time) {
        this.use_time = use_time;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

}


