package com.factory.before;


/**
 * @ClassName: Coffee
 * @Description: TODO (这里描述这个类的作用)
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