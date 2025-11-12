package com.bridge;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/11 22:55
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Shape square = new Square(new BlueColor());

        square.draw();
    }
}