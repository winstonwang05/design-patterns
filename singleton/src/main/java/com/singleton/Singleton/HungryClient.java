package com.singleton.Singleton;


/**
 * @ClassName: HungryClient
 * @Description: TODO (这里描述这个类的作用)
 * @Author: Winston
 * @Date: 2025/11/7 15:12
 * @Version: 1.0
 */
public class HungryClient {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance1  = HungrySingleton.getInstance();

        System.out.println(instance1 == instance); // true

    }
}