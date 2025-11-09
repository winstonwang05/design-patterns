package com.builder;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/9 14:47
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new AutoBike());
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}