package com.zhj.creational.factory_;

/**
 * 简单工厂模式
 */

public class FactoryStyle {
    public static void main(String[] args) {
        Factory1 factory = new Factory1();
        Product apple = factory.createProduct("apple");
        System.out.println(apple);
        apple.eat();
        Product banana = factory.createProduct("banana");
        System.out.println(banana);
        banana.eat();
        Product product = factory.createProduct("111");
        System.out.println(product);
        if (product == null) System.out.println("shabi nulll");
        System.out.println("===添加产品===需要修改代码，违反开闭原则=====添加√ 修改×====");
        new Factory1().createProduct("clothing").eat();
//        new Factory1().createProduct("yifu1").eat(); null exception

    }
}

interface Product {
    void eat();
}

class ProductA implements Product {

    @Override
    public void eat() {
        System.out.println("你得到了一个香蕉");
    }
}

class ProductB implements Product {

    @Override
    public void eat() {
        System.out.println("你得到了一个苹果");
    }
}

class ProductC implements Product {

    @Override
    public void eat() {
        System.out.println("你得到了一个衣服");
    }
}


interface Factory {
    Product createProduct(String name);
}

class Factory1 implements Factory {
    @Override
    public Product createProduct(String name) {
        if (name == "banana") {
            System.out.println("创建一个香蕉");
            return new ProductA();
        } else if (name == "apple") {
            System.out.println("创建一个苹果");
            return new ProductB();
        } else if (name == "clothing") {
            System.out.println("创建一个衣服");
            return new ProductC();
        } else {
            System.out.println("随便创建一个");
            return null;
        }
    }
}
