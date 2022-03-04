package decorator;

/**
 * 抽象装饰角色
 * @author yuwei
 * @date 2021/5/30 15:52
 */
public class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    /**
     * 注入被装饰的对象，以获取到被装修对象
     */
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void printMaterial() {
        System.out.println("装饰加点糖的");
        coffee.printMaterial();
    }
}
