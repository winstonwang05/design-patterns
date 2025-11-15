package com.mediator;


/**
 * @ClassName: ConcreteMediator
 * @Description: 具体中介者， 实现抽象中介者接口，并引用具体同事对象
 * @Author: Winston
 * @Date: 2025/11/15 11:36
 * @Version: 1.0
 */
public class ConcreteMediator implements Mediator {

    private ConcreteRentColleague concreteRentColleague;

    private ConcreteHouseHoldColleague concreteHouseHoldColleague;

    public ConcreteHouseHoldColleague getConcreteHouseHoldColleague() {
        return concreteHouseHoldColleague;
    }

    public void setConcreteHouseHoldColleague(ConcreteHouseHoldColleague concreteHouseHoldColleague) {
        this.concreteHouseHoldColleague = concreteHouseHoldColleague;
    }

    public ConcreteRentColleague getConcreteRentColleague() {
        return concreteRentColleague;
    }

    public void setConcreteRentColleague(ConcreteRentColleague concreteRentColleague) {
        this.concreteRentColleague = concreteRentColleague;
    }

    @Override
    public void contact(String message, Colleague colleague) {
        if (colleague == concreteRentColleague) {
            concreteHouseHoldColleague.getMessage(message);
        } else if (colleague == concreteHouseHoldColleague) {
            concreteRentColleague.getMessage(message);
        }
    }
}