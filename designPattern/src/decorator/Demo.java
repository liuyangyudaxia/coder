package decorator;

/**
 * 场景：我有一个对象，但是这个对象的功能不能使我满意（咖啡太苦了），我就拿装饰器给他装饰一下（给咖啡加糖）。
 * 结合代理模式理解 {@link proxy.Demo}
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {
        Coffee coffee = new BitterCoffee();
        //对有的对象进行装饰增强
        coffee = new CoffeeDecorator(coffee);
        coffee.printMaterial();
    }
}
