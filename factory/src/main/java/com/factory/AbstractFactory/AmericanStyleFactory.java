package com.factory.AbstractFactory;


/**
 * @ClassName: AmericanStyleFactory
 * @Description: 具体工厂 - 美式风味 产品族
 * @Author: Winston
 * @Date: 2025/11/8 13:56
 * @Version: 1.0
 */
public class AmericanStyleFactory implements AbstractFactory{

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}