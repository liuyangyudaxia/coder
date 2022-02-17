package abstractFactory;

/**
 * 具体产品-水果
 * @author yuwei
 * @date 2021/5/25 23:03
 */
public class Fruit implements Plant {
    @Override
    public void show() {
        System.out.println("I am fruits");
    }
}
