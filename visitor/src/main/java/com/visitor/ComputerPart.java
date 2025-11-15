package com.visitor;

/**
 * @ClassName: ComputerPart
 * @Description: 抽象元素接口 接受访问者，参数为访问者接口对象
 * @Author: Winston
 * @Date: 2025/11/15 17:17
 * @Version: 1.0
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}