package com.kh.day10.interfaceex;

public class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("뚜루루루루");
    }

    @Override
    public void receiveCall() {
        System.out.println("여보세요");
    }

    @Override
    public void printLogo() {
        System.out.println("=== 삼성 ===");
    }

    @Override
    public void displayNumber() {
        System.out.println("내 휴대폰 번호 : 010-xxxx-xxxx");
    }

    public void flash(){
        System.out.println("반짝반짝");
    }
}
