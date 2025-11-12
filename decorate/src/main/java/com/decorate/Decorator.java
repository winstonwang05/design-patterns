package com.decorate;


/**
 * @ClassName: Decorator
 * @Description: 抽象装饰者 继承 抽象组件类 其具体装饰者继承这个类，相当于此类就是用来转接,该类还需要引用抽象组件类
 * @Author: Winston
 * @Date: 2025/11/10 21:09
 * @Version: 1.0
 */
public abstract class Decorator extends FastFood{

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Decorator(String des, float price, FastFood fastFood) {
        super(des, price);
        this.fastFood = fastFood;
    }
}