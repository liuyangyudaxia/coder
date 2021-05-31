package com.yuwei.design.state;

/**
 * @author yuwei
 * @date 2021/5/31 22:16
 */
public class StatePatternClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
