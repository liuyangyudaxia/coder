package strategy;

/**
 * @author yuwei
 * @date 2021/5/30 20:41
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的方法被访问！");
    }
}
