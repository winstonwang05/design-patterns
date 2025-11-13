package com.strategy;


/**
 * @ClassName: StrategyC
 * @Description: 具体策略类 实现策略接口
 * @Author: Winston
 * @Date: 2025/11/13 15:30
 * @Version: 1.0
 */
public class StrategyC implements Strategy {
    @Override
    public void applyDiscount() {
        System.out.println("满100减50");
    }
}