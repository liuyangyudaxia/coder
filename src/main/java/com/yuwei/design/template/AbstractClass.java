package com.yuwei.design.template;

/**
 * 抽象类
 * @author yuwei
 * @date 2021/5/30 17:33
 */
public abstract class AbstractClass {
    public void TemplateMethod() {

    }
    public void SpecificMethod() {
        System.out.println("抽象类中具体方法");
    }
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
}
