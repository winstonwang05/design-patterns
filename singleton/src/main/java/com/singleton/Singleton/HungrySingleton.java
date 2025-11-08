package com.singleton.Singleton;


/**
 * @ClassName: HungrySingleton
 * @Description: 单例模式-饿汉式 ： 静态的成员变量
 * @Author: Winston
 * @Date: 2025/11/7 15:09
 * @Version: 1.0
 */
public class HungrySingleton {

    public HungrySingleton() {
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}