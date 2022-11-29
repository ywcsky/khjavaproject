package com.kh.practice.practice;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr.length-i;

            System.out.print(arr[i] + " ");
        }

    }
}
