package com.template;


/**
 * @ClassName: Tea
 * @Description: 具体茶类
 * @Author: Winston
 * @Date: 2025/11/13 14:06
 * @Version: 1.0
 */
public class Tea extends Beverage {
    @Override
    public void addCondiments() {
        System.out.println("4.加柠檬");
    }

    @Override
    public void brew() {
        System.out.println("2.用沸水沏茶");
    }
}