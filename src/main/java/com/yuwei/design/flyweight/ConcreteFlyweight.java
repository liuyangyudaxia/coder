package com.yuwei.design.flyweight;

/**
 * 具体享元角色
 * @author yuwei
 * @date 2021/5/30 16:43
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建！");
    }

    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.println("具体享元" + key + "被调用");
        System.out.println("非享元信息是" + outState.getInfo());
    }
}
