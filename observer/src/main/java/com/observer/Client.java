package com.observer;


/**
 * @ClassName: Client
 * @Description: 测试用例
 * @Author: Winston
 * @Date: 2025/11/14 21:30
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver("张三"));
        concreteSubject.attach(new ConcreteObserver("里斯"));
        concreteSubject.attach(new ConcreteObserver("王五"));


        concreteSubject.notifyObservers("发布新消息");
    }
}