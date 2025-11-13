package com.template;


/**
 * @ClassName: BlackCoffee
 * @Description: 具体黑咖啡类
 * @Author: Winston
 * @Date: 2025/11/13 14:07
 * @Version: 1.0
 */
public class BlackCoffee extends Beverage{

    @Override
    public void addCondiments() {
        // 黑咖啡不需要添加调料
    }
    // 重写钩子方法
    @Override
    public boolean customerWantsCondiments() {
        return false;
    }

    @Override
    public void brew() {
        System.out.println("2.开水沸黑咖啡");
    }
}