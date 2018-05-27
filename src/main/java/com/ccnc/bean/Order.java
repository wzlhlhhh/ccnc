package com.ccnc.bean;

// 订单信息
public class Order {
    // 订单的流水号、用户ID、土地ID、租用时间、价格、备注信息、订单起止时间、订单状态
    private Integer id;
    private String uuid;
    private int user_id;
    private int land_id;
    private int use_time;
    private double price;
    private String notice;
    private String start_time;
    private String end_time;
    private int statu;

    public Order() {
    }

    public Order(String uuid, int user_id, int land_id, int use_time, double price, String notice, String start_time, String end_time, int statu) {
        this.uuid = uuid;
        this.user_id = user_id;
        this.land_id = land_id;
        this.use_time = use_time;
        this.price = price;
        this.notice = notice;
        this.start_time = start_time;
        this.end_time = end_time;
        this.statu = statu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public int getUse_time() {
        return use_time;
    }

    public void setUse_time(int use_time) {
        this.use_time = use_time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", user_id=" + user_id +
                ", land_id=" + land_id +
                ", use_time=" + use_time +
                ", price=" + price +
                ", notice='" + notice + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", statu=" + statu +
                '}';
    }
}
