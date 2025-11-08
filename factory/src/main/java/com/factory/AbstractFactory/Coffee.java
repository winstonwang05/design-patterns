package com.factory.AbstractFactory;


/**
 * @ClassName: Coffee
 * @Description: 抽象产品
 * @Author: Winston
 * @Date: 2025/11/8 10:47
 * @Version: 1.0
 */
public abstract class Coffee {

    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}