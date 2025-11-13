package com.command;


/**
 * @ClassName: Client
 * @Description: 客户端 测试用例
 * @Author: Winston
 * @Date: 2025/11/13 20:03
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setTableNumber(1);
        order.setFood("辣椒炒肉拌面", 1);
        order.setFood("可乐", 2);

        Chef chef = new Chef();

        ConcreteCommand concreteCommand = new ConcreteCommand(chef, order);

        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);

        invoker.orderFinished();

    }
}