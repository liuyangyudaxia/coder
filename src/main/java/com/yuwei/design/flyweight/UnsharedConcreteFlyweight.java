package com.yuwei.design.flyweight;

/**
 * 非享元角色
 * @author yuwei
 * @date 2021/5/30 16:40
 */
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
