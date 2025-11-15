package com.mediator;


/**
 * @ClassName: Client
 * @Description: 客户端 ： 测试用例
 * @Author: Winston
 * @Date: 2025/11/15 11:38
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteRentColleague concreteRentColleague = new ConcreteRentColleague(concreteMediator, "小明");
        ConcreteHouseHoldColleague concreteHouseHoldColleague = new ConcreteHouseHoldColleague(concreteMediator, "小红");

        concreteMediator.setConcreteRentColleague(concreteRentColleague);
        concreteMediator.setConcreteHouseHoldColleague(concreteHouseHoldColleague);

        concreteHouseHoldColleague.contact("需要出租");
        concreteRentColleague.contact("出租房源");

    }
}