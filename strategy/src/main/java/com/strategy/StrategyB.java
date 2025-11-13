package com.strategy;


/**
 * @ClassName: StrategyB
 * @Description: 具体策略类 实现策略接口
 * @Author: Winston
 * @Date: 2025/11/13 15:29
 * @Version: 1.0
 */
public class StrategyB implements Strategy {
    @Override
    public void applyDiscount() {
        System.out.println("打8折处理");
    }
}