package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {
    public void exercise1(){
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

    public void exercise2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        while(true) {
            int num2 = 1;
            if (num > 0 && num < 10) {
                System.out.println("===" + num + "단===");
                while (num2 < 10) {
                    System.out.println(num + " x " + num2 + " = " + num * num2);
                    num2++;
                }
            }
            break;
        }
    }

    public void exercise3(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while(true) {
            System.out.print("정수 하나 입력 : ");
            num = sc.nextInt();
            if(num == -1){
                break;
            }else {
                sum += num;
            }
        }
        System.out.print("입력하신 수의 합은 : " + sum);

    }
}
