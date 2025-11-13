package com.command;


import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Order
 * @Description: 订单类
 * @Author: Winston
 * @Date: 2025/11/13 19:41
 * @Version: 1.0
 */
public class Order {
    private int tableNumber;
    private Map<String, Integer> map = new HashMap<>();


    public Map<String, Integer> getMap() {
        return map;
    }

    /**
     * key为订单的名称 value 是份数
     * @param name 餐名
     * @param number 数量
     */
    public void setFood(String name, int number) {
        map.put(name, number);
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
}