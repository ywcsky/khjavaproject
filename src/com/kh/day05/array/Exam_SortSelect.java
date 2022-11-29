package com.kh.day05.array;

public class Exam_SortSelect {
    public static void main(String[] args) {
        /*
        알고리즘 정렬
        1. 삽입정렬
        2. 선택정렬
        3. 버블정렬
        선택정렬
        배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
        특징 : 데이터가 적을때 좋은성능 , 많다면 성능저하
        배열의 n번 인덱스값을 n+1번 ~ 마지막 인덱스까지 비교함.
         */
        int [] arrs = {5, 2, 4, 1, 3};
        int min; //인덱스값 저장

        for(int i = 0; i < arrs.length; i++){
            min = i;
            for(int j = i+1; j < arrs.length; j++){
                if(arrs[min] > arrs[j]){
                    min = j;
                }
            }
            int temp = arrs[min];
            arrs[min] = arrs[i];
            arrs[i] = temp;
        }
        for (int i = 0; i < arrs.length; i++){
            System.out.print(arrs[i] + " ");
        }
    }
}
