package com.kh.practice.oop.practice;

import java.util.Random;

public class RSP {
    private String userInput;
    private String comInput;
    private int comRan;
    private int userInputResult;
    Random r = new Random();

    public RSP() {
        this.userInput = userInput;
        this.comInput = comInput;
        this.comRan = r.nextInt(3);
        this.userInputResult = userInputResult;
    }

    // 유저가 입력한 값을 변수 private 변수 userInPut에 저장
    // 저장한 값을 userInputResult에 숫자로 치환
    public void setUserInput(String userInput) {
        this.userInput = userInput;
        switch (userInput) {
            case "가위":
                userInputResult = 0;
                break;
            case "바위":
                userInputResult = 1;
                break;
            case "보":
                userInputResult = 2;
                break;
        }
    }

    public String getUserInput() {
        return userInput;
    }

    //컴퓨터의 랜덤 값을 글자로 치환하여 메인으로 보냄
    public String getComInput() {
        switch (comRan) {
            case 0:
                comInput = "가위";
                break;
            case 1:
                comInput = "바위";
                break;
            case 2:
                comInput = "보";
                break;
        }
        return comInput;
    }

    //  userInputResult에 저장된 값과 comRan의 값과 비교하여 승패 계산
    public void getResult() {
        if(userInputResult > comRan){
            System.out.println("이겼습니다.");
        } else if (comRan > userInputResult) {
            System.out.println("졌습니다.");
        } else {
            System.out.println("비겼습니다.");
        }
    }
}

