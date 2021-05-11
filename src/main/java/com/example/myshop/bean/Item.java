package com.example.myshop.bean;

public class Item {
    private Integer id;
    private String name;
    private Integer num;
    private Double price;
    private String picture;
    private String type;
    private String comment;
    public Item() {
    }

    public Item(Integer id, String name, Integer num, Double price, String picture, String type, String comment) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.price = price;
        this.picture = picture;
        this.type = type;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", type='" + type + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
