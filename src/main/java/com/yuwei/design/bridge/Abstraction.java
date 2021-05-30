package com.yuwei.design.bridge;

/**
 * 抽象化角色
 * @author yuwei
 * @date 2021/5/30 15:42
 */
abstract public class Abstraction {
    protected Implementor impl;
    protected Abstraction(Implementor impl) {
        this.impl = impl;
    }
    public abstract void Operation();
}
