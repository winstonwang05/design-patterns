package com.flyweight;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/12 20:45
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory.getInstance().getShape("I").getColor("black");
    }
}