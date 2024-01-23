package com.zhj.creational.builder_;

/**
 * 创建型：建造者模式
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setMouse("mouse");
        computer.setKeyboard("keyboard");
        System.out.println(computer);
        System.out.println("=======================");
        ComputerDirector director = new ComputerDirector();
        Computer mac = director.construct(new MacBookBuilder());
        System.out.println(mac);
        Computer omen = director.construct(new OmenBookBuilder());
        System.out.println(omen);
    }
}

class Computer {
    private String mouse;
    private String keyboard;

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "mouse=" + mouse + "  " + "keyboard=" + keyboard;
    }
}

interface ComputerBuilder {
    void appendMouse();
    void appendKeyboard();
    Computer getResult();
}

class MacBookBuilder implements ComputerBuilder {
    private Computer mac;

    public MacBookBuilder() {
        this.mac = new Computer();
    }

    @Override
    public void appendMouse() {
        this.mac.setMouse("苹果鼠标");
    }

    @Override
    public void appendKeyboard() {
        this.mac.setKeyboard("苹果键盘");
    }

    @Override
    public Computer getResult() {
        return mac;
    }

}

class OmenBookBuilder implements ComputerBuilder {
    private Computer omen = new Computer();

    @Override
    public void appendMouse() {
        omen.setMouse("雷蛇鼠标");
    }

    @Override
    public void appendKeyboard() {
        omen.setKeyboard("雷蛇键盘");
    }

    @Override
    public Computer getResult() {
        return omen;
    }
}

class ComputerDirector {

    public Computer construct(ComputerBuilder computerBuilder) {
        computerBuilder.appendMouse();
        computerBuilder.appendKeyboard();
        return computerBuilder.getResult();
    }
}
