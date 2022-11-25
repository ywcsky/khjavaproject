package com.kh.day02.operator;

public class Exam_Logical {
    public static void main(String[] args) {
        System.out.println("논리연산자 예제");
        /* 남자이면서 평균평점이 4.3 이상인 사람 > AND
           컴퓨터공학과 또는 경영학과인 사람 > OR
         */

        int num1 = 50, num2 = 30;
        boolean result1, result2, result3, result4;
        // num1 과 num2가 다르면서 num2가 num1보다 클때
        //(num1 != num2) && (num1 < num2);
        result1 = (num1 != num2) && (num1 < num2);
        //T
        result2 = (num1 < num2) || (num1 == num2);
        //F
        result3 = (num1 > num2) && (num1 != num2);
        //T
        result4 = (num1 > num2) || (num1 == num2);
        //T
        System.out.println("result 1의 결과값 : " + result1);
        System.out.println("result 2의 결과값 : " + result2);
        System.out.println("result 3의 결과값 : " + result3);
        System.out.println("result 4의 결과값 : " + result4);
        System.out.println();

        System.out.println("논리연산자 예제2");
        int aNum = 70;
        int bNum = 55;
        result1 = (aNum == bNum) || (aNum++ < 100);
        //T
        result2 = (aNum < bNum) && (--bNum < 55);
        //F
        result3 = (aNum != bNum) && (bNum-- < aNum++);
        //T
        result4 = (aNum++ != bNum) || (bNum++ <=85);
        //T
        System.out.println("result 1의 결과값 : " + result1);
        System.out.println("result 2의 결과값 : " + result2);
        System.out.println("result 3의 결과값 : " + result3);
        System.out.println("result 4의 결과값 : " + result4);
        System.out.println("aNum : " + aNum);
        System.out.println("bNum : " + bNum);


    }
}
