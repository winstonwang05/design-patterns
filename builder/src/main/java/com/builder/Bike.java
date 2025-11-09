package com.builder;


/**
 * @ClassName: Bike
 * @Description: 产品
 * @Author: Winston
 * @Date: 2025/11/9 14:39
 * @Version: 1.0
 */
public class Bike {
    /**
     * 车架
     */
    private String frame;

    /**
     * 车座
     */
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}