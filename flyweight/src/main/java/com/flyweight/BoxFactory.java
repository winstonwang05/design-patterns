package com.flyweight;


import java.util.HashMap;


/**
 * @ClassName: BoxFactory
 * @Description: 享元工厂  实现内部状态共享
 * @Author: Winston
 * @Date: 2025/11/12 20:40
 * @Version: 1.0
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    // 初始化属性
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    // 通过饿汉式实现单例模式
    public static BoxFactory getInstance() {
        return factory;
    }

    private static BoxFactory factory = new BoxFactory();

    // 根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}