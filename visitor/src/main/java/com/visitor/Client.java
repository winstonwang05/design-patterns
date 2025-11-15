package com.visitor;


/**
 * @ClassName: Client
 * @Description: 客户端， 测试用例
 * @Author: Winston
 * @Date: 2025/11/15 17:29
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ComputerPartDisplayVisitor computerPartDisplayVisitor = new ComputerPartDisplayVisitor();
        computer.accept(computerPartDisplayVisitor);

        ComputerPartPriceVisitor computerPartPriceVisitor = new ComputerPartPriceVisitor();
        computer.accept(computerPartPriceVisitor);

        double totalPrice = computerPartPriceVisitor.getTotalPrice();
        System.out.println("总价是" + totalPrice);


    }
}