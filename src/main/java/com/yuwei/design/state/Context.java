package com.yuwei.design.state;

/**
 * 环境类
 * @author yuwei
 * @date 2021/5/31 22:08
 */
public class Context {
    private State state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 对请求进行处理
     */
    public void handle() {
        state.Handle(this);
    }
}
