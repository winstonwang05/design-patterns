package com.decorate;


/**
 * @ClassName: FiredRice
 * @Description: 具体组件，继承抽象组件类 并重写方法
 * @Author: Winston
 * @Date: 2025/11/10 21:02
 * @Version: 1.0
 */
public class FiredRice extends FastFood{

    public FiredRice() {
        super("炒饭" , 10.0F);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}