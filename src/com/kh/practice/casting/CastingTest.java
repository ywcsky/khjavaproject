package com.kh.practice.casting;

import javax.swing.plaf.basic.BasicMenuUI;

class Champion {
    public void attack() {
        System.out.println("공격");
    }
}

class Leesin extends Champion {
    public void re(){
        super.attack();
    }
    @Override
    public void attack() {
        System.out.println("용의 일격");
    }
}

public class CastingTest {
    public static void main(String[] args) {
        Champion ch = new Leesin(); // 업캐스팅
        ch.attack();
        Leesin ch1 = (Leesin) ch; // 다운캐스팅
        ch1.re();
    }
}
