package com.bridge;


/**
 * @ClassName: Shape
 * @Description: 抽象化类 引用实现对象
 * @Author: Winston
 * @Date: 2025/11/11 22:51
 * @Version: 1.0
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}