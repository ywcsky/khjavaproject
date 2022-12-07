package com.kh.day10.interfaceex;

public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.displayNumber();
        phone.printLogo();
        phone.receiveCall();
        phone.sendCall();
        phone.flash();
    }
}
