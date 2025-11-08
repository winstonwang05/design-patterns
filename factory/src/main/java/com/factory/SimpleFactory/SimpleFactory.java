package com.factory.SimpleFactory;




/**
 * @ClassName: SimpleFactory
 * @Description: TODO (这里描述这个类的作用)
 * @Author: Winston
 * @Date: 2025/11/8 11:09
 * @Version: 1.0
 */
public class SimpleFactory {
    public Coffee createCoffee(String type) {
         Coffee coffee = null;
        if ("American".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("Latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;

    }
}