package com.facade;


/**
 * @ClassName: Facade
 * @Description: 外观
 * @Author: Winston
 * @Date: 2025/11/12 11:02
 * @Version: 1.0
 */
public class Facade {
    private Light light;
    private TV tv;
    private AirConditional airConditional;
    public Facade() {
        light = new Light();
        tv = new TV();
        airConditional = new AirConditional();
    }

    public void speak(String message) {
        if (message.contains("打开")) {
            light.on();
            tv.on();
            airConditional.on();
        } else if (message.contains("关闭")) {
            light.off();
            tv.off();
            airConditional.off();
        }
    }
}