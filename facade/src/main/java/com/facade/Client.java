package com.facade;


/**
 * @ClassName: Client
 * @Description: 外观模式测试用例
 * @Author: Winston
 * @Date: 2025/11/12 11:05
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.speak("打开");

        System.out.println("-------------------------------------");
        facade.speak("关闭");
        /**
         * 开启电灯
         * 开启电视
         * 开启空调
         * -------------------------------------
         * 关闭电灯
         * 关闭电视
         * 关闭空调
         */
    }
}