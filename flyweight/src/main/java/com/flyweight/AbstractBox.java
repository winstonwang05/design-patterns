package com.flyweight;


/**
 * @ClassName: AbstractBox
 * @Description: 抽象享元类 定义抽象方法
 * @Author: Winston
 * @Date: 2025/11/12 20:37
 * @Version: 1.0
 */
public abstract class AbstractBox {

    public abstract String getShape();

    // 获取形状和颜色
    public void getColor(String color) {
        System.out.println("形状为：" + getShape() + " 颜色为：" + color);
    }
}