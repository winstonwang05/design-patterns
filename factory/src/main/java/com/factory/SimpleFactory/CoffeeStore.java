package com.factory.SimpleFactory;


/**
 * @ClassName: CoffeeStore
 * @Description: TODO (这里描述这个类的作用)
 * @Author: Winston
 * @Date: 2025/11/8 10:50
 * @Version: 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Coffee coffee = simpleFactory.createCoffee(type);

        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}