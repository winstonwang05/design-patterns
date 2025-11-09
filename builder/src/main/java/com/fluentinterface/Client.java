package com.fluentinterface;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/9 15:52
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .setColor("heise")
                .setBrand("iphone")
                .build();
        System.out.println(phone);

    }
}