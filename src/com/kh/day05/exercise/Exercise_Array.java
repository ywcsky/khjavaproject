package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
    public void exercise1() {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.print(nums[i] + " ");
        }
    }

    public void exercise2() {
        String arr[] = {"딸기", "복숭아", "키위", "사과", "바나나"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "바나나") {
                System.out.println("바나나");
            }
        }
    }

    public void exercise3() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.print("양의 정수 입력 : ");
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        System.out.println("평균 : " + (double) sum / nums.length);
    }

    public void exercise4() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0;
        System.out.print("양의 정수 입력 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("제일 큰 수 : " + max);
    }

    public void exercise5() {
        Scanner sc = new Scanner(System.in);
        char[] id = new char[14];
        char[] copy = new char[14];
        System.out.print("주민번호 입력 : ");
        String idNum = sc.next();
        for (int i = 0; i < id.length; i++) {
            id[i] = idNum.charAt(i);
        }
        for(int i = 0; i < id.length; i++){
            copy[i] = id[i];
        }
        int j = 8;
        for (int i = 0; i < id.length; i++) {
            if (i > 7) id[i] = '*';
            System.out.print(id[i]);
        }
        System.out.println();
        for (int i = 0; i < id.length; i++) {
            if (i > 7) id[i] = '*';
            System.out.print(copy[i]);
        }
    }

}

