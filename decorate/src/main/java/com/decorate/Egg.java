package com.decorate;


/**
 * @ClassName: Egg
 * @Description: 具体装饰者， 继承抽象装饰者， 并重写方法
 * @Author: Winston
 * @Date: 2025/11/10 21:13
 * @Version: 1.0
 */
public class Egg extends Decorator {

    public Egg(FastFood fastFood) {
        super("鸡蛋", 1, fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + getFastFood().getDes() ;
    }
}