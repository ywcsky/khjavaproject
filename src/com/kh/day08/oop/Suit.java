package com.kh.day08.oop;

public class Suit {
    private int size, price;
    private String brand;

    public Suit(int size){
        this(2,"Hazzys");
        System.out.println("Suit(int) 호출");
    }
    public Suit(int size, String brand){
        this(size, brand, 100000);
        System.out.println("Suit(int, String) 호출");
    }
    public Suit(int size, String brand,int price){
        this.size = size;
        this.brand = brand;
        this.price = price;
        System.out.println("Suit(int, String, int) 호출");
    }
}
