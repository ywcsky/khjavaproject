package com.kh.practice.interfaceex;

class Human2{
    public void bodyHuman(Human human){
        human.walk();
        human.speak();
        human.shooting();
    }
}

public class HumanRun {
    public static void main(String[] args) {
        Human2 hu2 = new Human2();
        hu2.bodyHuman(new Ani());
        hu2.bodyHuman(new Kim());
        hu2.bodyHuman(new Wang());
        hu2.bodyHuman(new Seo());
    }
}
