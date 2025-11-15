package com.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteSubject
 * @Description: 具体主题类 实现抽象主题类
 * @Author: Winston
 * @Date: 2025/11/14 21:25
 * @Version: 1.0
 */
public class ConcreteSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String updateMessage) {
        for (Observer observer : observers) {
            observer.update(updateMessage);
        }
    }
}