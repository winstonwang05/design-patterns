package com.observer;


/**
 * @ClassName: ConcreteObserver
 * @Description: 具体观察者类 实现抽象观察者类
 * @Author: Winston
 * @Date: 2025/11/14 21:27
 * @Version: 1.0
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String updateMessage) {
        System.out.println(name + "更新了！！！：" + updateMessage);
    }
}