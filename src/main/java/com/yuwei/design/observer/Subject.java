package com.yuwei.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 * @author yuwei
 * @date 2021/5/31 22:22
 */
public abstract class Subject {
    protected List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
    public void remove(Observer observer) {
        observerList.remove(observer);
    }
    public abstract void notifyObserver();

}
