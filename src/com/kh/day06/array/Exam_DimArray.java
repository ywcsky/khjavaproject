package com.kh.day06.array;

import java.util.Scanner;

public class Exam_DimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arrs = new int[5][3];
        int k = 1;
        System.out.println("행의 크기 : " + arrs.length);
        System.out.println("열의 크기 : " + arrs[0].length);
        for(int i = 0; i < arrs.length; i++){
            for (int j =0; j < arrs[i].length; j++){
                System.out.print(i + "행" + j + "열에 입력될 정수를 입력하시오 : ");
                arrs[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arrs.length; i++){
            for (int j = 0; j < arrs[i].length; j++){
                System.out.printf("%d행의 %d열의 값은 : %d \n",i,j,arrs[i][j]);
            }
        }
    }
}
