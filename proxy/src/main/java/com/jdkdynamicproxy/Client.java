package com.jdkdynamicproxy;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/9 22:16
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell(); // JDK动态代理增强了
                            // 卖票中。。。。。

    }
}