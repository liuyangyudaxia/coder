package strategy;

/**
 * @author yuwei
 * @date 2021/5/30 20:42
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的方法被访问");
    }
}
