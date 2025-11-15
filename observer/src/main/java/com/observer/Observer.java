package com.observer;

/**
 * @ClassName: Observer
 * @Description: 观察者接口 需要执行更新操作
 * @Author: Winston
 * @Date: 2025/11/14 21:23
 * @Version: 1.0
 */
public interface Observer {
    void update(String updateMessage);
}