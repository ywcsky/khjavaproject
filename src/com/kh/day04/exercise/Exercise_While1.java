package com.kh.day04.exercise;

public class Exercise_While1 {
    public static void main(String[] args) {
        int sum = 0, count = 1;
        while(true){
            if(count % 2 == 1){
                sum += count;
            }
            if(count == 100) break;
            count++;
        }
        System.out.print(sum);
    }
}
