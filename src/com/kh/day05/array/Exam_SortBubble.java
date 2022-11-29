package com.kh.day05.array;

public class Exam_SortBubble {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 4};
    int a;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0 ; j < (arr.length-1)-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
