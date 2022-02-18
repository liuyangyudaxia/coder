package abstractFactory.product;

/**
 * 具体产品-蔬菜
 * @author yuwei
 * @date 2021/5/25 23:04
 */
public class Vegetables implements Plant {
    @Override
    public void show() {
        System.out.println("I am vegetables");
    }
}
