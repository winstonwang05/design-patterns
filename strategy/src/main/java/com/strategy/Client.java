package com.strategy;


/**
 * @ClassName: Client
 * @Description: 客户端--测试用例
 * @Author: Winston
 * @Date: 2025/11/13 15:34
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());

        context.showDiscount();

        System.out.println("-------------------------------");

        Context contextB = new Context(new StrategyB());

        contextB.showDiscount();
        System.out.println("--------------------------------");

        Context contextC = new Context(new StrategyC());

        contextC.showDiscount();

    }
}