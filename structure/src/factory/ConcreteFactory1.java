package factory;

/**
 * 具体工厂1
 * @author yuwei
 * @date 2021/5/25 22:51
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product buildProduct() {
        System.out.println("工厂1->产品1");
        return new ConcreteProduct1();
    }
}
