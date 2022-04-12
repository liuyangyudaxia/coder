package builder;

/**
 * 具体建造者
 * @author yuwei
 * @date 2021/5/25 23:20
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildA() {
        product.setPartA("建造A部分");
    }

    @Override
    public void buildB() {

    }

    @Override
    public void buildC() {

    }
}
