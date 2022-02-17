package factory;

/**
 * 具体产品1
 * @author yuwei
 * @date 2021/5/25 22:49
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("产品1....");
    }
}
