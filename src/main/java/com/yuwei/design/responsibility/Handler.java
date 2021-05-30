package com.yuwei.design.responsibility;

/**
 * 抽象处理者角色
 * 举个例子：ClassLoader加载类的过程
 * @author yuwei
 * @date 2021/5/30 23:08
 */
public abstract class Handler {
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}
