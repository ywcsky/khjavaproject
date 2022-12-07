package com.kh.interfaceex.interface01;

public class ZooRun {
    public static void main(String[] args) {
        ZooKeeper zk = new ZooKeeper();

//        zk.feed(lion);
//        zk.feed(tiger);

        Bouncer b = new Bouncer();
        b.barkAnimal(new Tiger());
        b.barkAnimal(new Lion());
        b.barkAnimal(new Crocodile());
    }
}
