package com.kh.project.day12_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CafeFunction {
    Scanner sc = new Scanner(System.in);
    CafeData cd2 = new CafeData();
    CafeData[] cd;
    int num, menu, coffeeCount = cd2.getCoffeeCount(), orderNum, choice, sum, orderNumber = 1;
    char yn;

    public CafeFunction() {
        cd = new CafeData[5];
        for (int i = 0; i < cd.length; i++) {
            cd[i] = new CafeData();
        }
    }

    // 성공메시지
    public void cafeSuccessMessage(int para) {
        if (para == 1) {
            System.out.println("┌─────────────────────────────────┐");
            System.out.println("│                                 │");
            System.out.println("│       등록에 성공 하였습니다.       │");
            System.out.println("│                                 │");
            System.out.println("└─────────────────────────────────┘");
        } else if (para == 2) {
            System.out.println("┌─────────────────────────────────┐");
            System.out.println("│       주문이 완료 되었습니다.       │");
            System.out.println("│          주문번호 : " + orderNumber + "             │");
            System.out.println("│             감사합니다.           │");
            System.out.println("└─────────────────────────────────┘");
        } else if (para == 3) {
            System.out.println("┌─────────────────────────────────┐");
            System.out.println("│                                 │");
            System.out.println("│       등록에 실패 하였습니다.       │");
            System.out.println("│                                 │");
            System.out.println("└─────────────────────────────────┘");
        } else if (para == 4) {
            System.out.println("┌─────────────────────────────────┐");
            System.out.println("│                                 │");
            System.out.println("│        변경이 완료되었습니다.       │");
            System.out.println("│                                 │");
            System.out.println("└─────────────────────────────────┘");
        }
    }

    // 선택
    public void input() {
        System.out.println("===================================");
        System.out.print("선택 : ");
        try {
            menu = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("올바른 값을 입력해주세요.");
            sc.next();
        }
    }

    // 해당 커피의 주문금액 저장
    public void orderPrice(int menu) {
        for (int i = menu; i < menu + 1; i++) {
            cd2.setPrice(cd[i].getCoffeePrice() * num);
        }
    }

    // 메인 페이지 출력
    public void cafeMain() {
        System.out.println("========== 카페관리프로그램 ==========");
        System.out.println("1. 메뉴판 수정");
        System.out.println("2. 주문탭");
        input();
        switch (menu) {           // 1분기 - 1. 메뉴판 수정 / 2. 주문탭
            case 1:
                cafeMenuEdit();
                break;
            case 2:
                cafeMenu();
                break;
            default:
                System.out.println("올바른 숫자를 입력해주세요.");
        }
    }

    // 메뉴판 수정 페이지
    public void cafeMenuEdit() {
        System.out.println("============ 메뉴판 수정 ============");
        System.out.println("1. 커피 추가");
        System.out.println("2. 판매 금액 변경");
        System.out.println("3. 메인 화면으로 가기");
        System.out.println("===================================");
        System.out.print("선택 : ");
        try {
            menu = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("올바른 값을 입력해주세요.");
            sc.next();
            cafeMenuEdit();
        }
        switch (menu) {
            case 1:
                cafeCoffeeEdit();
                break;
            case 2:
                coffeePriceEdit();
                break;
            case 3:
                cafeMain();
                break;
            default:
                System.out.println("올바른 값을 입력해주세요.");
                cafeMenuEdit();
        }
    }

    // 커피 추가 페이지
    public void cafeCoffeeEdit() {
        while (coffeeCount < 5) {
            System.out.println("============ 커피  추가 =============");
            System.out.print("커피 이름 : ");
            cd[coffeeCount].setCoffeeName(sc.next());
            System.out.print("가격 : ");
            try {
                cd[coffeeCount].setCoffeePrice(sc.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("올바른 값을 입력해주세요.");
                sc.next();
                cafeMenuEdit();
            }
            System.out.println("====================================");
            if (coffeeCount == 5) {
                System.out.println("최대 등록수가 초과했습니다.");
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;
            } // 최대 등록 조건문
            System.out.println("커피를 더 추가 하시겠습니까? Y or N : ");
            try {
                yn = sc.next().charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("올바른 값을 입력해주세요.");
                cafeMenuEdit();
            }
            cd2.setCoffeeCount(1);
            coffeeCount++;
            if (yn == 'y' || yn == 'Y') {

            } else if (yn == 'N' || yn == 'n') {
                cafeSuccessMessage(1);
                cafeMenuEdit();
                break;
            } else {
                System.out.println("올바른 값을 입력해주세요.");
                cafeMenuEdit();
            }
        }
        if (coffeeCount == 5) System.out.println("최대 등록 수에 도달하였습니다.");
        cafeSuccessMessage(3);
    }

    // 커피 금액 변경
    public void coffeePriceEdit() {
        System.out.println("========== 커피 가격 수정 ============");
        for (int i = 0; i < coffeeCount; i++) {
            System.out.printf("%d. %s %20d원\n", (i + 1), cd[i].getCoffeeName(), cd[i].getCoffeePrice());
        }
        System.out.println("====================================");
        System.out.print("해당 커피 선택 (뒤로 : 6) : ");

        try {
            choice = sc.nextInt();
            if (choice == 6) {
                cafeMenuEdit();
            }
            System.out.print("변경 금액 : ");
            cd[choice - 1].setCoffeePrice(sc.nextInt());
            cafeSuccessMessage(4);
            cafeMenuEdit();
            System.out.println("올바른 값을 입력해주세요.");
            sc.next();
            cafeSuccessMessage(3);
            coffeePriceEdit();
        } catch (InputMismatchException e) {
            System.out.println("올바른 값을 입력해주세요.");
            sc.next();
            cafeMenuEdit();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("위 목록에서 선택해주세요.");
            cafeSuccessMessage(3);
            coffeePriceEdit();
        }


    }

    // 커피 주문탭 출력
    public void cafeMenu() {
        end:
        System.out.println("============= 커피 주문 ==============");
        for (int i = 0; i < coffeeCount; i++) {
            System.out.printf("%d. %s %20d원\n", (i + 1), cd[i].getCoffeeName(), cd[i].getCoffeePrice());
        }
        System.out.println("====================================");
        System.out.print("커피 선택 : ");
        try {
            orderNum = sc.nextInt() - 1;
            if (orderNum == 1003) {
                cafeMain();
            }
            if (cd[orderNumber - 1].getCoffeeName() == null) {
                System.out.println("등록된 값이 없습니다.");
                System.out.println("다시 선택해주세요.");
                cafeMenu();
            }
            System.out.print("주문 수 : ");
            num += sc.nextInt();
            cd2.orderCoffee[orderNum] = num;

            orderPrice(menu);
            System.out.println("추가 주문 진행 진행 여부 (Y or N) : ");
            switch (sc.next().charAt(0)) {
                case 'Y':
                case 'y':
                    System.out.println("추가 주문 진행합니다.");
                    cafeMenu();
                    break;
                case 'N':
                case 'n':
                    orderPage();
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("올바른 값을 입력해주세요.");
            sc.next();
            cafeMenu();
        }
    }

    //커피 빌지 확인 및 결제
    public void orderPage() {
        System.out.println("============ 결제 주문서 ============");
        System.out.printf("품목 \t\t 주문수량 \t\t 가격\n");
        for (int i = 0; i < coffeeCount + 1; i++) {
            if (cd2.orderCoffee[i] != 0) {
                System.out.printf("%s %10d %14d원\n", cd[i].getCoffeeName(), cd2.orderCoffee[i], cd[i].getCoffeePrice());

            }
        }
        for (int i = 0; i < coffeeCount + 1; i++) {
            if (cd2.orderCoffee[i] != 0) {
                sum += cd2.orderCoffee[i] * cd[i].getCoffeePrice();
            }
        }
        while (true) {
            try {
                System.out.printf("결제금액 : %22d원\n", sum);
                System.out.println("결제 수단 선택 : 1. 카드  2. 현금");
                choice = sc.nextInt();
                if (choice == 1 || choice == 2) {
                    cafeSuccessMessage(2);
                    orderNumber++;
                    break;
                } else {
                    System.out.println("위 결제 수단중 하나를 선택하세요~");
                }
            } catch (InputMismatchException e) {
                System.out.println("올바른 결제 수단을 선택해주세요.^^");
                sc.next();
            }
        }
        cafeMenu();
    }
}
