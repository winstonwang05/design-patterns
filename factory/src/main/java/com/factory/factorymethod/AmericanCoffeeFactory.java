package com.factory.factorymethod;


/**
 * @ClassName: AmericanCoffeeFactory
 * @Description: 制作美式咖啡的工厂
 * @Author: Winston
 * @Date: 2025/11/8 11:34
 * @Version: 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}