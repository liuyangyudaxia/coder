package factory;

/**
 * 具体工厂2
 * @author yuwei
 * @date 2021/5/25 22:52
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product buildProduct() {
        System.out.println("工厂2->产品2");
        return new ConcreteProduct2();
    }
}
