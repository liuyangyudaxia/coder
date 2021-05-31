package com.yuwei.design.observer;

/**
 * 具体观察者
 * @author yuwei
 * @date 2021/5/31 22:21
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void response() {
        System.out.println("具体观察者A反应....");
    }
}
