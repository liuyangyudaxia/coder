package com.yuwei.design.adapter;

/**
 * 对象适配器类
 * @author yuwei
 * @date 2021/5/30 15:24
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
