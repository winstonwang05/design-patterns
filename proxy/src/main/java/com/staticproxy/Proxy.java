package com.staticproxy;


/**
 * @ClassName: Proxy
 * @Description: 代理类
 * @Author: Winston
 * @Date: 2025/11/9 17:27
 * @Version: 1.0
 */
public class Proxy implements SellTickets{
    /**
     * 引用具体主题类
     */
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        trainStation.sell();
        System.out.println("功能增强了");
    }
}