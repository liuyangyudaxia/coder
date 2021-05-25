package com.yuwei.design.builder;

/**
 * 指挥者
 * @author yuwei
 * @date 2021/5/25 23:21
 */
public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getResult();
    }
}
