package abstractFactory.factory;

import abstractFactory.product.Animal;
import abstractFactory.product.Horse;
import abstractFactory.product.Plant;
import abstractFactory.product.Vegetables;

/**
 * 具体工厂2
 * @author yuwei
 * @date 2021/5/25 23:08
 */
public class Factory2 implements AbstractFactory {
    @Override
    public Animal buildAnimal() {
        System.out.println("product horse");
        return new Horse();
    }

    @Override
    public Plant buildPlant() {
        System.out.println("product vegetables");
        return new Vegetables();
    }
}
