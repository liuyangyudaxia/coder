package strategy;

/**
 * @author yuwei
 * @date 2021/5/30 20:44
 */
public class Demo {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        //设置策略
        c.setStrategy(s);
        c.strategyMethod();
        s = new ConcreteStrategyB();
        //更换策略
        c.setStrategy(s);
        c.strategyMethod();
    }
}
