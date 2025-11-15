package com.mediator;


/**
 * @ClassName: ConcreteHouseHoldColleague
 * @Description: 具体同事类 ，继承抽象同事类
 * @Author: Winston
 * @Date: 2025/11/15 11:35
 * @Version: 1.0
 */
public class ConcreteHouseHoldColleague extends Colleague{
    public ConcreteHouseHoldColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房主：" + name +" 收到消息为：" + message);
    }
}