package com.kh.day11.wrapperex;

public class Exam_Wrapper {
    public static void main(String[] args) {
        int num = 0;
//        Integer soo = new Integer(4); // 이전 방식
        Integer su = Integer.valueOf(4);
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        char c1  = '4', c2 = 'F';
        if(Character.isDigit(c1)){
            System.out.println(c1 + " 은 숫자");
        }
        if(Character.isAlphabetic(c2)){
            System.out.println(c2 + " 는 영문자");
        }

    }
}

