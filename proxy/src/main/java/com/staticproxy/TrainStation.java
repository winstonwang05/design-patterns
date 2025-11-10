package com.staticproxy;


/**
 * @ClassName: TrainStation
 * @Description: 具体主题类 ，被代理的对象类
 * @Author: Winston
 * @Date: 2025/11/9 17:27
 * @Version: 1.0
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("售票");
    }
}