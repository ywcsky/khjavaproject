package com.kh.practice.zoointerface;

public class ZooKeeper {
    int x, y;
    public ZooKeeper(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(int x, int y){
        return "x : " + x + ", Y : " + y;
    }
    public void feed(){
        System.out.println("feed meat");
    }
    public void feed(Predator predator){
        System.out.println("feed " + predator.animalFood());
    }
}
