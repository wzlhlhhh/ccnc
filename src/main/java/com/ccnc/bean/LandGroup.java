package com.ccnc.bean;

// 基地类
public class LandGroup {
    // 基地的基本信息，包括面积、基地名、默认单块土地大小和价格、利用率0/99、管理员ID、星级、农场主人数、位置
    private Integer id;
    private int area;
    private String name;
    private int one_area;
    private double one_price;
    private String use_num;
    private int admin_id;
    private String star;
    private int owner_num;
    private String location;

    public LandGroup() {
    }

    public LandGroup(int area, String name, int one_area, double one_price, String use_num, int admin_id, String star, int owner_num, String location) {
        this.area = area;
        this.name = name;
        this.one_area = one_area;
        this.one_price = one_price;
        this.use_num = use_num;
        this.admin_id = admin_id;
        this.star = star;
        this.owner_num = owner_num;
        this.location = location;
    }

    @Override
    public String toString() {
        return "LandGroup{" +
                "id=" + id +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", one_area=" + one_area +
                ", one_price=" + one_price +
                ", use_num='" + use_num + '\'' +
                ", admin_id=" + admin_id +
                ", star='" + star + '\'' +
                ", owner_num=" + owner_num +
                ", location='" + location + '\'' +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getOwner_num() {
        return owner_num;
    }

    public void setOwner_num(int owner_num) {
        this.owner_num = owner_num;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOne_area() {
        return one_area;
    }

    public void setOne_area(int one_area) {
        this.one_area = one_area;
    }

    public double getOne_price() {
        return one_price;
    }

    public void setOne_price(double one_price) {
        this.one_price = one_price;
    }

    public String getUse_num() {
        return use_num;
    }

    public void setUse_num(String use_num) {
        this.use_num = use_num;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

}
