package com.decorate;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/10 21:20
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        FiredRice firedRice = new FiredRice();

        System.out.println(firedRice.getDes()+ "的价格是：" + firedRice.cost());

        Egg egg = new Egg(firedRice);
        System.out.println(egg.getDes() + "的价格是：" + egg.cost());
    }
}