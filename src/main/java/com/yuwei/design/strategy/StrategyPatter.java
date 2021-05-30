package com.yuwei.design.strategy;

/**
 * @author yuwei
 * @date 2021/5/30 20:44
 */
public class StrategyPatter {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
