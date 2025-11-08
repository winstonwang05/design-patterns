package com.factory.AbstractFactory;




/**
 * @ClassName: LatteCoffee
 * @Description: 具体产品
 * @Author: Winston
 * @Date: 2025/11/8 10:49
 * @Version: 1.0
 */
public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}