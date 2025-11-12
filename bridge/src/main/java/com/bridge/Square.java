package com.bridge;


/**
 * @ClassName: Square
 * @Description: 拓展抽象化类
 * @Author: Winston
 * @Date: 2025/11/11 22:53
 * @Version: 1.0
 */
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("画一个正方形");
        color.applyColor();

    }

    public Square(Color color) {
        super(color);
    }
}