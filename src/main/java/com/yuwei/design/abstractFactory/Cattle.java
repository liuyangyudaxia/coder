package com.yuwei.design.abstractFactory;

/**
 * 具体产品-牛
 * @author yuwei
 * @date 2021/5/25 23:01
 */
public class Cattle implements Animal {
    @Override
    public void show() {
        System.out.println("I am a cattle");
    }
}
