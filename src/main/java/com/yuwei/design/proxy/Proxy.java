package com.yuwei.design.proxy;

/**
 * @author yuwei
 * @date 2021/5/27 23:16
 */
public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
            this.preRequest();
            realSubject.request();
            this.postRequest();
        }
    }
    public void preRequest() {
        System.out.println("预处理");
    }
    public void postRequest() {
        System.out.println("后置处理");
    }
}
