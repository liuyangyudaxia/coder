package com.yuwei.design.singleton;

/**
 * 单例模式-饿汉式
 * 类创建时就创建，因此线程安全
 * @author yuwei
 * @date 2021/5/24 23:50
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
