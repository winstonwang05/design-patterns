package com.singleton.Singleton;


/**
 * @ClassName: HungryClient0
 * @Description: TODO (这里描述这个类的作用)
 * @Author: Winston
 * @Date: 2025/11/7 15:22
 * @Version: 1.0
 */
public class HungryClient0 {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton0.getInstance();
        HungrySingleton instance1 = HungrySingleton0.getInstance();

        System.out.println(instance1 == instance); // true;
    }
}