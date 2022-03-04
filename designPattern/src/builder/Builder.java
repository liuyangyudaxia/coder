package builder;

/**
 * 抽象建造者
 * @author yuwei
 * @date 2021/5/25 23:17
 */
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildA();

    public abstract void buildB();

    public abstract void buildC();

    public Product getResult() {
        return product;
    }
}
