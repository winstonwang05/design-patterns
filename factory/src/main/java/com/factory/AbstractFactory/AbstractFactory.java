package com.factory.AbstractFactory;


/**
 * @ClassName: AbstractFactory
 * @Description: 抽象工厂
 * @Author: Winston
 * @Date: 2025/11/8 13:46
 * @Version: 1.0
 */
public interface AbstractFactory {
    public abstract Coffee createCoffee();

    public abstract Dessert createDessert();
}