package com.zhj.creational.factory_;

/**
 * 创建型：抽象工厂模式
 * 一个具体工厂，创建多种产品。 高端工厂 中端工厂
 * eg: xiaomi 高端top 中端middle 低端low apple
 */
public class AbstractFactoryStyle {
    public static void main(String[] args) {
        new TopFactory().createIPhone().show();
        new TopFactory().createXiaomi().play();
        new MiddleFactory().createIPhone().show();
        new MiddleFactory().createXiaomi().play();
    }
}

interface IPhone {
    void show();
}

interface Xiaomi {
    void play();
}

class PhoneTop implements IPhone {

    @Override
    public void show() {
        System.out.println("高端iphone被展示");
    }
}

class PhoneMiddle implements IPhone {

    @Override
    public void show() {
        System.out.println("中端iphone被展示");
    }
}

class XiaomiTop implements Xiaomi {

    @Override
    public void play() {
        System.out.println("高端小米被游玩");
    }
}

class XiaomiMiddle implements Xiaomi {

    @Override
    public void play() {
        System.out.println("中端小米被游玩");
    }
}

interface PhoneFactory {
    IPhone createIPhone();

    Xiaomi createXiaomi();
}

class TopFactory implements PhoneFactory {

    @Override
    public IPhone createIPhone() {
        return new PhoneTop();
    }

    @Override
    public Xiaomi createXiaomi() {
        return new XiaomiTop();
    }
}

class MiddleFactory implements PhoneFactory {
    @Override
    public IPhone createIPhone() {
        return new PhoneMiddle();
    }

    @Override
    public Xiaomi createXiaomi() {
        return new XiaomiMiddle();
    }
}


