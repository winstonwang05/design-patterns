package com.jdkdynamicproxy;


/**
 * @ClassName: TrainStation
 * @Description: 真实主题类 -- 动态代理模式
 * @Author: Winston
 * @Date: 2025/11/9 18:55
 * @Version: 1.0
 */
public class TrainStation implements SellTickets{

    @Override
    public void sell() {
        System.out.println("卖票中。。。。。");
    }
}