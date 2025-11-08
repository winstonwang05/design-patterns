package com.singleton.Singleton;


/**
 * @ClassName: HungrySingleton0
 * @Description: 饿汉式：静态代码块的单例模式
 * @Author: Winston
 * @Date: 2025/11/7 15:20
 * @Version: 1.0
 */
public class HungrySingleton0 {

    public HungrySingleton0() {
    }

    private static HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}