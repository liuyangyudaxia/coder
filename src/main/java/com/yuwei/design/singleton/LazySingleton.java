package com.yuwei.design.singleton;

/**
 * 单例模式-懒汉式
 * @author yuwei
 * @date 2021/5/24 23:46
 */
public class LazySingleton {

    //保证instance在所有线程同步
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
