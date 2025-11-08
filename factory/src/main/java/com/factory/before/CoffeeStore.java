package com.factory.before;


/**
 * @ClassName: CoffeeStore
 * @Description: TODO (这里描述这个类的作用)
 * @Author: Winston
 * @Date: 2025/11/8 10:50
 * @Version: 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("American".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("Latte".equals(type)) {
            coffee = new LatteCoffee();
        }

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}