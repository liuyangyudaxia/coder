package com.yuwei.design.facade;

/**
 * 外观角色
 * @author yuwei
 * @date 2021/5/30 16:02
 */
public class Facade {
    private System1 obj1 = new System1();
    private System2 obj2 = new System2();
    public void method() {
        obj1.method1();
        obj2.method2();
    }
}
