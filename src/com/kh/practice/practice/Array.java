package com.kh.practice.practice;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public void Arr() {
        String arr[] = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(arr[1]);
    }

    public void Arr2() {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }

    public void arr3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요 : ");
        int size = sc.nextInt();
        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "번째 문자열 : ");
            arr[i] = sc.next();
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까?");
            char ch = sc.next().charAt(0);
            if (ch == 'N' || ch == 'n') {
                for (int i = 0; i < arr.length; i++) {
                  //  System.out.print("%s, %s, "arr[i]);
                    }
                }
                break;
            }

            System.out.print("더 입력하고 싶은 개수 : ");
            int size2 = sc.nextInt();
            String copy[] = new String[size + size2];
            for (int i = 0; i < size2; i++) {
                System.out.println(size + size2 + "번째 문자열 : ");
                copy[size + i + 1] = sc.next();
            }
            for (int i = 0; i < arr.length; i++) {
                copy[i] = arr[i];
            }

//            if (ch == 'n' || ch == 'n') {
//                System.out.print("[");
//            for (int i = 0; i < copy.langth; i++) {
//                System.out.print(arr[i] + ", ");
//            }
//                System.out.print("]");
//            }
//       }

    }
}
