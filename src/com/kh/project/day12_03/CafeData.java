package com.kh.project.day12_03;

public class CafeData {
    private int coffeePrice;
    private String coffeeName;
    private int coffeeCount, price, orderCount;
    int[] orderCoffee = new int[5];

    public CafeData(int[] orderCoffee) {
        for (int i = 0; i < orderCoffee.length; i++) {
            this.orderCoffee[i] = 0;
        }
    }

    public CafeData() {
    }

    public CafeData(int coffeePrice, String coffeeName, int coffeeCount, int price, int orderCoffee, int orderCount) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeCount = coffeeCount;
        this.price = price;
        this.orderCount = orderCount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCoffeeCount(int coffeeCount) {
        this.coffeeCount += coffeeCount;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public int getCoffeeCount() {
        return coffeeCount;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }
}
