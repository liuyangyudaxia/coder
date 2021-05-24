package com.yuwei.design.simpleFactory;

/**
 * 简单工厂类
 * @author yuwei
 * @date 2021/5/24 23:00
 */
public class SimpleFactory {
    public static Animal buildProduct(String type) {
        switch (type) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
        }
        return null;
    }
}
