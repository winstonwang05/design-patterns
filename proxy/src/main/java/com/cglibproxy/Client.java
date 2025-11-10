package com.cglibproxy;


/**
 * @ClassName: Client
 * @Description: CGlib 测试类
 * @Author: Winston
 * @Date: 2025/11/10 11:23
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}