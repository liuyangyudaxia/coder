package com.yuwei.design.abstractFactory;

/**
 * 具体工厂1
 * @author yuwei
 * @date 2021/5/25 23:06
 */
public class Farm1 implements AbstractFactory{
    @Override
    public Animal buildAnimal() {
        System.out.println("cattle");
        return new Cattle();
    }

    @Override
    public Plant buildPlant() {
        System.out.println("fruit");
        return new Fruit();
    }
}
