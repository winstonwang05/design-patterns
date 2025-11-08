package com.factory.AbstractFactory;


/**
 * @ClassName: ItalianStyleFactory
 * @Description: 具体工厂 意大利风味 -产品族
 * @Author: Winston
 * @Date: 2025/11/8 13:55
 * @Version: 1.0
 */
public class ItalianStyleFactory implements AbstractFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Brownie();
    }
}