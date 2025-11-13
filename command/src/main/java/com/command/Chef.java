package com.command;


/**
 * @ClassName: Chef
 * @Description: 接收者类， 厨师类
 * @Author: Winston
 * @Date: 2025/11/13 19:44
 * @Version: 1.0
 */
public class Chef {
    public void makeFood(String name, int number) {
        System.out.println("订单为：" + name + "，份数：" + number);
    }
}