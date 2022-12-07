package com.kh.day10.interfaceex;

public interface PhoneInterface {
    public int a = 1000;
    public static final int TIME_OUT = 1000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo(){ //default 만 로직작성 가능
        // 하위 호환성을 위해 작성한다.
        // 즉, 하위 호환성을 유지하고 인터페이스의 보안을 위해 작성
        System.out.println("** LG **");
    }
    public default void displayNumber(){
        System.out.println("내 휴대폰 번호 : ");
    }

}
