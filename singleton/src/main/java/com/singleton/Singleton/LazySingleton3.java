package com.singleton.Singleton;


/**
 * @ClassName: LazySingleton3
 * @Description: 懒汉式 单例模式 通过 静态内部类实现
 * @Author: Winston
 * @Date: 2025/11/7 16:33
 * @Version: 1.0
 */
public class LazySingleton3 {

    public LazySingleton3() {
    }

    // 静态内部类
    private static class LazySingletonHolder {
        private static final LazySingleton3 instance = new LazySingleton3();
    }

    public static LazySingleton3 getInstance() {
        return LazySingletonHolder.instance;
    }
}