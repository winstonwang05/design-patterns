package com.observer;

/**
 * @ClassName: Subject
 * @Description: 抽象主题类 也就是被观察者
 * @Author: Winston
 * @Date: 2025/11/14 21:20
 * @Version: 1.0
 */
public interface Subject {

    // 添加用户
    void attach(Observer observer);
    // 删除用户

    void detach(Observer observer);
    // 通知用户
    void notifyObservers(String updateMessage);

}