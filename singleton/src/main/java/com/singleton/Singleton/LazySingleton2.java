package com.singleton.Singleton;


/**
 * @ClassName: LazySingleton2
 * @Description: 懒汉式 创建单例对象 - 双重检查锁实现
 * @Author: Winston
 * @Date: 2025/11/7 16:25
 * @Version: 1.0
 */
public class LazySingleton2 {
    public LazySingleton2() {
    }

    private static volatile LazySingleton2 instance;

    public static LazySingleton2 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton2.class) {
                if (instance == null) {
                    instance = new LazySingleton2();
                }
            }
        }

        return instance;
    }
}