package com.template;


/**
 * @ClassName: Beverage
 * @Description: 抽象类 定义了制作饮料的模板
 * @Author: Winston
 * @Date: 2025/11/13 13:53
 * @Version: 1.0
 */
public abstract class Beverage {


    // 模板方法
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // 烧水
    public void boilWater() {
        System.out.println("1.烧水");
    }

    // 倒入杯中
    public void pourInCup() {
        System.out.println("3.倒入杯中");
    }

    // 抽象方法，子类必须实现的
    public abstract void brew();

    public abstract void addCondiments();

    // 钩子方法
    public boolean customerWantsCondiments() {
        return true;
    }
}