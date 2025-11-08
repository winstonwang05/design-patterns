package com.factory.factorymethod;


/**
 * @ClassName: Client
 * @Description: TODO (这里描述这个类的作用)
 * @Author: Winston
 * @Date: 2025/11/8 11:36
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore();

        coffeeStore.setFactory(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();

        System.out.println(coffee.getName());
    }
}