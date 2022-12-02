package com.kh.practice.oop.practice.cafeprogram;

import java.awt.print.Pageable;
import java.util.Scanner;

public class CafeRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, priceCount = 0, orderList = 0, sum = 0;

        while (true) {
            System.out.println("==== 카페 주문 프로그램 ====");
            System.out.println("1. 아메리카노    2000원");
            System.out.println("2. 카페라떼     3000원");
            System.out.println("3. 아이스티     3000원");
            System.out.println("4. 초코라떼     3500원");

            // 주문 번호 입력
            System.out.print("주문 번호 입력 : ");
            int order = sc.nextInt();

            //주문 수량 입력
            System.out.print("주문 수량 입력 : ");
            int orderCount = sc.nextInt();

            //주문 금액 계산


            System.out.println("==== 주문서 ====");
            switch (order) {
                case 1:
                    System.out.println("1. 아메리카노");
                    sum = 2000 * orderCount;

                    break;
                case 2:
                    System.out.println("2. 카페라떼");
                    sum = 3000 * orderCount;

                    break;
                case 3:
                    System.out.println("3. 아이스티");
                    sum = 3000 * orderCount;

                    break;
                case 4:
                    System.out.println("4. 초코라떼");
                    sum = 3500 * orderCount;
                    break;
            }
            System.out.printf("결제 가격 : %d원\n" , sum);

            System.out.print("추가 주문 진행 여부(Y, N) : ");
            char toOrder = sc.next().charAt(0);
            if (toOrder == 'N' || toOrder == 'n') {
                break;
            }
        }


    }
}
