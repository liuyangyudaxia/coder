package com.yuwei.design.Mediator;

/**
 * @author yuwei
 * @date 2021/5/31 22:40
 */
public class MediatorPattern {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague c1 = new ConcreteColleagueA();
        Colleague c2 = new ConcreteColleagueB();
        mediator.register(c1);
        mediator.register(c2);
        c1.send();
        System.out.println("--------");
        c2.send();
    }
}
