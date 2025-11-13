package com.template;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/13 14:09
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Tea();
        beverage.prepareRecipe();
        System.out.println("-----------------------------------");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("-----------------------------------");
        Beverage blackCoffee = new BlackCoffee();
        blackCoffee.prepareRecipe();

    }
}