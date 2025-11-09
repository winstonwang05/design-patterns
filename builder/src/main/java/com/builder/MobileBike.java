package com.builder;


/**
 * @ClassName: MobileBike
 * @Description: 继承抽象建造者
 * @Author: Winston
 * @Date: 2025/11/9 14:43
 * @Version: 1.0
 */
public class MobileBike extends Builder{

    @Override
    public Bike buildBike() {
        return bike;
    }

    @Override
    public void createFrame() {
        bike.setFrame("mobile bike");
    }

    @Override
    public void createSeat() {
        bike.setSeat("mobile seat");
    }
}