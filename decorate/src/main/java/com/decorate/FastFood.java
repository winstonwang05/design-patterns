package com.decorate;


/**
 * @ClassName: FastFood
 * @Description: 抽象组件 -- 抽象类
 * @Author: Winston
 * @Date: 2025/11/10 20:59
 * @Version: 1.0
 */
public abstract class FastFood {

    private float price;
    private String des;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public FastFood(String des, float price) {
        this.des = des;
        this.price = price;
    }

    public FastFood(){}

    public abstract float cost();
}