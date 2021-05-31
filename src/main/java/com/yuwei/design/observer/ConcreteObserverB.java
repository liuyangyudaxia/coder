package com.yuwei.design.observer;

/**
 * 具体观察者B
 * @author yuwei
 * @date 2021/5/31 22:22
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者B反应了...");
    }
}
