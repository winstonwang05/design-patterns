package com.strategy;


/**
 * @ClassName: Context
 * @Description: 上下文 持有对策略接口的引用 并定义方法
 * @Author: Winston
 * @Date: 2025/11/13 15:32
 * @Version: 1.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void showDiscount() {
        strategy.applyDiscount();
    }
}