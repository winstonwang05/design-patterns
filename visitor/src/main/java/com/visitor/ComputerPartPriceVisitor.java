package com.visitor;


/**
 * @ClassName: ComputerPartPriceVisitor
 * @Description: 具体访问者实现 访问者接口
 * @Author: Winston
 * @Date: 2025/11/15 17:26
 * @Version: 1.0
 */
public class ComputerPartPriceVisitor implements ComputerPartVisitor{

    private double totalPrice = 0;

    @Override
    public void visit(KeyBoard keyBoard) {
        totalPrice += 500;
        System.out.println(keyBoard.getName() + "价格是" + totalPrice);
    }

    @Override
    public void visit(Computer computer) {
        totalPrice += 200;
        System.out.println(computer.getName() + "价格是" + totalPrice);
    }

    @Override
    public void visit(Monitor monitor) {
        totalPrice += 300;
        System.out.println(monitor.getName() + "价格是" + totalPrice);
    }

    @Override
    public void visit(Mouse mouse) {
        totalPrice += 400;
        System.out.println(mouse.getName() + "价格是" + totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}