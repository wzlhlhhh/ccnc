package com.ccnc.bean;

// 用户详细信息类
public class UserDetail {
    // 用户的用户名、地址、手机、余额、拥有土地数、经验值、真实姓名、身份证、年龄
    private Integer id;
    private String user;
    private String address;
    private int phone;
    private double money;
    private int land_num;
    private int level;
    private String real_name;
    private String id_card;
    private int age;

    public UserDetail() {
    }


    public UserDetail(String user, String address, int phone, double money, int land_num, int level, String real_name, String id_card, int age) {
        this.user = user;
        this.address = address;
        this.phone = phone;
        this.money = money;
        this.land_num = land_num;
        this.level = level;
        this.real_name = real_name;
        this.id_card = id_card;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getLand_num() {
        return land_num;
    }

    public void setLand_num(int land_num) {
        this.land_num = land_num;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", money=" + money +
                ", land_num=" + land_num +
                ", level=" + level +
                ", real_name='" + real_name + '\'' +
                ", id_card='" + id_card + '\'' +
                ", age=" + age +
                '}';
    }
}
