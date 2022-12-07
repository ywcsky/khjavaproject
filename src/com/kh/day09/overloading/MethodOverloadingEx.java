package com.kh.day09.overloading;

class Weapon {
    // 오버로딩
    public Weapon(){}
    public Weapon(int value){
        System.out.println(value);
    }
    public Weapon(int value, String name){
        System.out.println(value + ":" + name);
    }

    protected int fire() {
        return 1;
    }

    protected int fire(int steampack){
        return steampack * 100;
    }

    protected int fire(int steampack, int medicine){
        return steampack+medicine * 100;
    }

    protected int fire(String steampack){
        System.out.println(steampack);
        return 1;
    }
}

class Cannon extends Weapon {
    @Override
    protected int fire() {
        return 2;
    }
}

public class MethodOverloadingEx {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("ds");
        System.out.println(1);
        System.out.println('g');
        System.out.println(true);
    }
}
