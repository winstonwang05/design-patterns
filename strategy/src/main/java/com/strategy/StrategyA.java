package com.strategy;


/**
 * @ClassName: StrategyA
 * @Description: 具体策略 实现策略接口并重写方法
 * @Author: Winston
 * @Date: 2025/11/13 15:28
 * @Version: 1.0
 */
public class StrategyA implements Strategy {

    @Override
    public void applyDiscount() {
        System.out.println("买一送一");
    }
}