package com.kh.practice.zoointerface;

public class ZooRun {
    public static void main(String[] args) {
        ZooKeeper zk = new ZooKeeper(1,2);
        zk.feed(new Bear());
        zk.feed(new Lion());
        zk.feed(new Tiger());
        System.out.println(zk.toString());

    }
}
