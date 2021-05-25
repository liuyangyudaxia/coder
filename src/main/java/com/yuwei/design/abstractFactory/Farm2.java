package com.yuwei.design.abstractFactory;

/**
 * 具体工厂2
 * @author yuwei
 * @date 2021/5/25 23:08
 */
public class Farm2 implements AbstractFactory{
    @Override
    public Animal buildAnimal() {
        System.out.println("horse");
        return new Horse();
    }

    @Override
    public Plant buildPlant() {
        System.out.println("vegetables");
        return new Vegetables();
    }
}
