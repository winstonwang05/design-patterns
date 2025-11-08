package com.factory.factorymethod;


/**
 * @ClassName: LatteCoffeeFactory
 * @Description: TODO (这里描述这个类的作用)
 * @Author: Winston
 * @Date: 2025/11/8 11:34
 * @Version: 1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory{

   @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

}