package com.kh.practice.oop.practice.cafeprogram;

public class CafeMenu {
    CafeController cc = new CafeController();
    int cont1, cont2, cont3, cont4;

    public void menu() {
        while (true) {
            // 카페 메뉴판 출력
            System.out.println("==== 카페 메뉴판 ====");
            System.out.println("1. 아메리카노   2000원");
            System.out.println("2. 카페라떼     3000원");
            System.out.println("3. 아이스티     3000원");
            System.out.println("4. 초코라떼     3500원");
            //주문 커피 확인
            System.out.print("선택 : ");
            int choiceCoffe = cc.sc.nextInt();
            cc.contCoffe(choiceCoffe);

            //주문 수량 확인
            System.out.print("주문 수량 : ");
            int orderCount = cc.sc.nextInt();
            cc.contOrder(orderCount);

            System.out.println("계속 주문 하시겠습니까?(Y, N) : ");
            char yn = cc.sc.next().charAt(0);
            if (yn == 'N' || yn == 'n') {
                break;
            }
        }
    }

    public void order() {
        System.out.println("==== 주문 내역 ====");

        //if()
    }
}
