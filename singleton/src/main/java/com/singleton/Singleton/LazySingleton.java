package com.singleton.Singleton;


/**
 * @ClassName: LazySingleton
 * @Description: 单例模式 - 懒汉式 ：一旦实例对象创建之后才会
 * @Author: Winston
 * @Date: 2025/11/7 16:11
 * @Version: 1.0
 */
public class LazySingleton {

    public LazySingleton() {
    }

    private static LazySingleton instance;

/*    *//**
     * 线程不安全的懒汉式 创建对象
     * @return 返回单例对象
     *//*
    public static LazySingleton getInstance() {
        // 只有实例不存在才会创建
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }*/

    /**
     *  线程安全的懒汉式 创建对象
     * @return 返回单例对象
     */
    public static synchronized LazySingleton getInstance() {
        // 只有实例不存在才会创建
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}