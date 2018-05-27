package com.ccnc.bean;

// 土地信息
public class Land {
    // 单块土地，有所属基地ID、大小、价格、名称、状态、在基地中的序号
    private Integer id;
    private int landgroup_id;
    private int area;
    private double price;
    private String name;
    private int statu;
    private int num;

    public Land() {
    }

    public Land(int landgroup_id, int area, double price, String name, int statu, int num) {
        this.landgroup_id = landgroup_id;
        this.area = area;
        this.price = price;
        this.name = name;
        this.statu = statu;
        this.num = num;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Land{" +
                "id=" + id +
                ", landgroup_id=" + landgroup_id +
                ", area=" + area +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", statu=" + statu +
                ", num=" + num +
                '}';
    }
}
