package com.factory.AbstractFactory;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/8 14:00
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AmericanStyleFactory americanStyleFactory = new AmericanStyleFactory();
        Coffee coffee = americanStyleFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        Dessert dessert = americanStyleFactory.createDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());

    }
}