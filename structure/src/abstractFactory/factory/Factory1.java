package abstractFactory.factory;

import abstractFactory.product.Animal;
import abstractFactory.product.Cattle;
import abstractFactory.product.Fruit;
import abstractFactory.product.Plant;

/**
 * 工厂1
 * @author yuwei
 * @date 2021/5/25 23:06
 */
public class Factory1 implements AbstractFactory {
    @Override
    public Animal buildAnimal() {
        System.out.println("product cattle");
        return new Cattle();
    }

    @Override
    public Plant buildPlant() {
        System.out.println("product fruit");
        return new Fruit();
    }
}
