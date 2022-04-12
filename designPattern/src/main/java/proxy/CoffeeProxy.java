package proxy;

import decorator.BitterCoffee;
import decorator.Coffee;

/**
 * @author yuwei
 */
public class CoffeeProxy implements Coffee {

    private final Coffee coffee;

    /**
     * 自己创建对象达到增强的目的
     */
    public CoffeeProxy() {
        this.coffee = new BitterCoffee();
    }


    @Override
    public void printMaterial() {
        System.out.println("糖");
        coffee.printMaterial();
    }
}
