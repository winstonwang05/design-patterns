package com.factory.factorymethod;


/**
 * @ClassName: CoffeeStore
 * @Description: TODO (这里描述这个类的作用)
 * @Author: Winston
 * @Date: 2025/11/8 10:50
 * @Version: 1.0
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();

        coffee.addSugar();
        coffee.addMilk();

        return coffee;

    }
}