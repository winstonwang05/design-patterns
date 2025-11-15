package com.mediator;


/**
 * @ClassName: Colleague
 * @Description: 抽象同事类
 * @Author: Winston
 * @Date: 2025/11/15 11:31
 * @Version: 1.0
 */
public abstract class Colleague {

    protected String name;

    protected Mediator mediator;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
}