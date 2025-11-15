package com.visitor;


/**
 * @ClassName: KeyBoard
 * @Description: 具体元素类， 实现抽象元素类，并有accept方法
 * @Author: Winston
 * @Date: 2025/11/15 17:20
 * @Version: 1.0
 */
public class KeyBoard implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return "键盘";
    }
}