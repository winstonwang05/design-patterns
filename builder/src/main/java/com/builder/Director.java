package com.builder;


/**
 * @ClassName: Director
 * @Description: 指挥类
 * @Author: Winston
 * @Date: 2025/11/9 14:45
 * @Version: 1.0
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.createSeat();
        builder.createFrame();
        return builder.buildBike();
    }
}