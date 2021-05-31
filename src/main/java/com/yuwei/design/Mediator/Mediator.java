package com.yuwei.design.Mediator;

/**
 * 抽象中介类
 * @author yuwei
 * @date 2021/5/31 22:31
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl);
}
