package com.bawei.huwanjun.bean;

/**
 * author: 斛万珺
 * data: 2019/11/27 10:10:00
 * function:
 */
public class GoodsBean {

    private String name;
    private int num;
    private String price;
    private int color;

    public GoodsBean(String name, int num, String price, int color) {
        this.name = name;
        this.num = num;
        this.price = price;
        this.color = color;
    }

    public GoodsBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GoodsBean{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", price='" + price + '\'' +
                ", color=" + color +
                '}';
    }
}
