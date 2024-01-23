package com.zhj.kama;

import java.util.Scanner;

/**
 * 创建型：工厂方法模式
 * 对应卡哥卡码网第二题题解：积木工厂
 */
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = scanner.nextInt();
        scanner.nextLine(); // 换行
        for (int i = 0; i < lineCount; i++) {
            String[] s = scanner.nextLine().split(" ");
            String name = s[0];
            int count = Integer.parseInt(s[1]);
            if (name.equals("Square")) {
                BlockFactorySystem.printBlock(new SquareFactory(), count);
            }
            if (name.equals("Circle")) {
                BlockFactorySystem.printBlock(new CircleFactory(), count);
            }
        }

    }
}

interface Block {
    void show();
}

class CircleBlock implements Block {

    @Override
    public void show() {
        System.out.println("Circle Block");
    }
}

class SquareBlock implements Block {

    @Override
    public void show() {
        System.out.println("Square Block");
    }
}

interface Factory {
    Block build();
}

class SquareFactory implements Factory {

    @Override
    public Block build() {
        return new SquareBlock();
    }
}

class CircleFactory implements Factory {

    @Override
    public Block build() {
        return new CircleBlock();
    }
}

class BlockFactorySystem {

    public static void printBlock(Factory factory, Integer num) {
        Block block = factory.build();
        while (num-- > 0) {
            block.show();
        }
    }
}
