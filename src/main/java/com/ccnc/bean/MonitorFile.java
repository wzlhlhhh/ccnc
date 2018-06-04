package com.ccnc.bean;

// 监控文件
public class MonitorFile {
    // 监控文件的对应摄像头、生成时间、存放位置、简介
    private Integer id;
    private int camera_id;
    private String create_time;
    private String location;
    private String abs;

    public MonitorFile() {
    }

    public MonitorFile(int camera_id, String create_time, String locatio, String abs) {
        this.camera_id = camera_id;
        this.create_time = create_time;
        this.location = location;
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "MonitorFile{" +
                "id=" + id +
                ", camera_id=" + camera_id +
                ", create_time='" + create_time + '\'' +
                ", location='" + location + '\'' +
                ", abs='" + abs + '\'' +
                '}';
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCamera_id() {
        return camera_id;
    }

    public void setCamera_id(int camera_id) {
        this.camera_id = camera_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
