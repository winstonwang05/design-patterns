package com.visitor;

/**
 * @ClassName: ComputerPartVisitor
 * @Description: 访问者接口 访问各个元素，参数为各元素对象
 * @Author: Winston
 * @Date: 2025/11/15 17:18
 * @Version: 1.0
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Monitor monitor);

    void visit(Mouse mouse);

    void visit(KeyBoard keyBoard);

}