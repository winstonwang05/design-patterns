package com.builder;


/**
 * @ClassName: AutoBike
 * @Description: 继承抽象建造者
 * @Author: Winston
 * @Date: 2025/11/9 14:44
 * @Version: 1.0
 */
public class AutoBike extends Builder{

    @Override
    public Bike buildBike() {
        return bike;
    }

    @Override
    public void createFrame() {
        bike.setFrame("auto bike");
    }

    @Override
    public void createSeat() {
        bike.setSeat("auto seat");
    }
}