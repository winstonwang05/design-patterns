package com.visitor;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Computer
 * @Description: 对象结构 实现抽象元素接口，并有accept方法，除了本类的访问，还有其他元素的访问
 * @Author: Winston
 * @Date: 2025/11/15 17:19
 * @Version: 1.0
 */
public class Computer implements ComputerPart{
    List<ComputerPart> computerParts;

    public Computer() {
        computerParts = new ArrayList<>();
        computerParts.add(new KeyBoard());
        computerParts.add(new Monitor());
        computerParts.add(new Mouse());
    }


    @Override
    public void accept(ComputerPartVisitor visitor) {
        // 本类访问
        visitor.visit(this);

        // 其他元素的访问
        for (ComputerPart computerPart : computerParts) {
            computerPart.accept(visitor);
        }
    }

    public String getName() {
        return "电脑";
    }
}