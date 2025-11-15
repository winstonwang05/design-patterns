package com.visitor;


/**
 * @ClassName: ComputerPartDisplayVisitor
 * @Description: 具体访问者实现 访问者接口
 * @Author: Winston
 * @Date: 2025/11/15 17:24
 * @Version: 1.0
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("显示键盘 : " + keyBoard.getName());
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("显示电脑 : " + computer.getName());
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("显示显示器 : " + monitor.getName());
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("显示鼠标 : " + mouse.getName());
    }
}