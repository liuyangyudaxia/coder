package decorator;

/**
 * 苦咖啡对象
 * @author yuwei
 * @date 2021/5/30 15:50
 */
public class BitterCoffee implements Coffee {
    public BitterCoffee() {
    }

    @Override
    public void printMaterial() {
        System.out.println("咖啡");
    }
}
