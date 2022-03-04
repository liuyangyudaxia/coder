package proxy;

import decorator.Coffee;

/**
 * 代理demo,IO流使用的就是装饰器模式
 * 结合装饰器模式理解{@link decorator.Demo}
 * @author yuwei
 */
public class Demo {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeProxy();
        coffee.printMaterial();
    }
}
