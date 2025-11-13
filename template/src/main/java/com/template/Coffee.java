package com.template;


/**
 * @ClassName: Coffee
 * @Description: 具体类 重写抽象类的抽象方法 基础方法可选是否重写
 * @Author: Winston
 * @Date: 2025/11/13 14:04
 * @Version: 1.0
 */
public class Coffee extends Beverage {
    @Override
    public void brew() {
        System.out.println("2.用开水沸咖啡");
    }

    @Override
    public void addCondiments() {
        System.out.println("4.加糖");
    }
}