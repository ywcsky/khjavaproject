package com.kh.day06.exercise;

public class Exercise_DimArray {
    public void exercise1() {
        int[][] arr = new int[5][5];
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 4; j > (arr[i].length - 6); j--) {
                arr[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void exercise2() {
        int[][] arr = new int[5][5];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 4; j > (arr[i].length - 6); j--) {
                arr[j][i] = num;
                num++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void exercise3() {
        int[][] arr = new int[5][5];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[j][i] = num;
                num++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void exercise4() {
        int[][] arr = new int[5][5];
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            int k = arr.length;
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = num;
                    num++;
                } else {
                    arr[i][k] = num;
                    num++;
                    k--;
                }
            }
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public void exercise5(){
        double[][] score = {{3.3,3.4},{3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
        double sum = 0;
        for(int i = 0; i < score.length; i++){
            for (int j = 0; j < score[i].length; j++){
                sum += score[i][j];
            }
        }
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + sum /8);
     }
    }

