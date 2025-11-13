package com.command;


import java.util.Map;
import java.util.Set;

/**
 * @ClassName: ConcreteCommand
 * @Description: 具体命令类 实现命令接口并重写方法,还需要引用接收者对象
 * @Author: Winston
 * @Date: 2025/11/13 19:46
 * @Version: 1.0
 */
public class ConcreteCommand implements Command {

    private Chef chef;

    private Order order;

    public ConcreteCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void excute() {
        System.out.println("厨师（调用者）执行任务了，桌号：" + order.getTableNumber());
        Map<String, Integer> map = order.getMap();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            chef.makeFood(key, map.get(key));
        }
        System.out.println("桌号为：" + order.getTableNumber() + "出餐");
    }
}