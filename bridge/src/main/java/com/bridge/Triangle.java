package com.bridge;


/**
 * @ClassName: Triangle
 * @Description: 拓展抽象化类 继承抽象化类
 * @Author: Winston
 * @Date: 2025/11/11 22:54
 * @Version: 1.0
 */
public class Triangle extends Square {

    @Override
    public void draw() {
        color.applyColor();
        System.out.println("画一个三角形");
    }

    public Triangle(Color color) {
        super(color);
    }
}