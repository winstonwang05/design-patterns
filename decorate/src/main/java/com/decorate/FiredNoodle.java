package com.decorate;


/**
 * @ClassName: FiredNoodle
 * @Description: 具体组件类 继承抽象组件类 并重写花费的方法
 * @Author: Winston
 * @Date: 2025/11/10 21:05
 * @Version: 1.0
 */
public class FiredNoodle extends FastFood{

    public FiredNoodle() {
        super("炒面", 13);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}