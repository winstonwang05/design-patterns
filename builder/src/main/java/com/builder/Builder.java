package com.builder;


/**
 * @ClassName: Builder
 * @Description: 抽象建造者
 * @Author: Winston
 * @Date: 2025/11/9 14:40
 * @Version: 1.0
 */
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void createFrame();

    public abstract void createSeat();

    public abstract Bike buildBike();
}