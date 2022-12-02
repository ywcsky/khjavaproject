package com.kh.practice.oop.practice.cafeprogram;

import java.util.Scanner;

public class CafeController {
    private int order, choice;
    CafeMenu cm = new CafeMenu();
    Scanner sc = new Scanner(System.in);

    public CafeController() {
        this.order = order;
        this.choice = choice;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setOrderCk() {

    }
    public void contCoffe(int choiceCoffe) {
        switch (choiceCoffe) {
            case 1:
                cm.cont1 += 1;
                break;
            case 2:
                cm.cont2 += 1;
                break;
            case 3:
                cm.cont3 += 1;
                break;
            case 4:
                cm.cont4 += 1;
                break;
        }

    }
    public void contOrder(int orderCount) {

    }

}
