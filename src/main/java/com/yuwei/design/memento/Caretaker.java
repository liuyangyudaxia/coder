package com.yuwei.design.memento;

/**
 * 管理者
 * @author yuwei
 * @date 2021/5/31 23:20
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
