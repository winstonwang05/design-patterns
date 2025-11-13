package com.flyweight;


/**
 * @ClassName: IBox
 * @Description: 具体享元类，继承抽象享元类，实现抽象方法
 * @Author: Winston
 * @Date: 2025/11/12 20:39
 * @Version: 1.0
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }
}