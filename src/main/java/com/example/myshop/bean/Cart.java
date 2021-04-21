package com.example.myshop.bean;

public class Cart {
    private Integer id;
    private String name;
    private Integer num;
    private Double price;
    private Double total;
    private String address;
    private String user;

    public Cart() {
    }

    public Cart(Integer id, String name, Integer num, Double price, Double total, String address, String user) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.price = price;
        this.total = total;
        this.address = address;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", price=" + price +
                ", total=" + total +
                ", address='" + address + '\'' +
                ", user='" + user + '\'' +
                '}';
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
