package com.zhj.creational.factory_;

public class FactoryStylePlus {
    public static void main(String[] args) {
        new BananaFactory().produce().eat();
        new AppleFactory().produce().eat();
        System.out.println("==============符合开闭原则，添加产品，只需要新增代码，不用修改代码=============");
        new PearFactory().produce().eat();
    }
}

interface Fruit {
    void eat();
}

class Banana implements Fruit {

    @Override
    public void eat() {
        System.out.println("你买并吃了一个香蕉");
    }
}

class Apple implements Fruit {

    @Override
    public void eat() {
        System.out.println("你买并吃了一个苹果");
    }
}

interface FruitFactory {
    Fruit produce();
}

class AppleFactory implements FruitFactory {

    @Override
    public Fruit produce() {
        System.out.println("生产一个苹果");
        return new Apple();
    }
}

class BananaFactory implements FruitFactory {

    @Override
    public Fruit produce() {
        System.out.println("生产一个香蕉");
        return new Banana();
    }
}

class Pear implements Fruit {

    @Override
    public void eat() {
        System.out.println("你买并吃了一个梨");
    }
}

class PearFactory implements FruitFactory {

    @Override
    public Fruit produce() {
        System.out.println("生产一个梨");
        return new Pear();
    }
}

