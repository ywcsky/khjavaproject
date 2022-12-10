package com.kh.day13.socket.baseball;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import java.util.Random;

public class BaseballServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Random r = new Random();
        int port = 8589;
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        int[] numbers = new int[3];
        try {
            System.out.println("서버소켓을 생성하였습니다.");
            serverSocket = new ServerSocket(port);
            Thread.sleep(2000);
            System.out.println("클라이언트의 접속을 기다립니다.");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 접속했습니다.");

            is = socket.getInputStream();
            os = socket.getOutputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);
            System.out.println("서버 준비 완료");

            // 번호 3개 뽑은 후 게임 준비
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = 0;

                // 랜덤 입력 및 중복제거
                numbers[i] = r.nextInt(9) + 1;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == numbers[i]) {
                        i--;
                        break;
                    }
                }
            }

            String[] numbersString = new String[3];
            for(int i = 0; i < numbers.length;i++){
                numbersString[i] = String.valueOf(numbers[i]);
            }

            System.out.println("서버 숫자 ->" + numbers[0] + " " + numbers[1] + " " + numbers[2]);
            System.out.println("숫자 준비 완료");
            // 값 받기
            String readNum = dis.readUTF();
            System.out.println("받기 : " + readNum);
            // 받은 값이 numbers의 값과 비교했을때
            // 숫자가 맞고 위치가 맞는지
            // 숫자는 맞는데 위치는 틀린지
            // 아무것도 맞지 않았는지
            // 스트라이크, 볼로 출력한다.
            int strike = 0, ball = 0;

            String[] num = new String[3];
            for (int i = 0; i < readNum.length(); i++) {
                num[i] = String.valueOf(readNum.charAt(i));
                System.out.println(num[i]);
            }


            for (int i = 0; i < readNum.length(); i++) {
                if (Objects.equals(num[i], numbersString[i])) {
                    strike++;
                }
                for (int j = 0; j < readNum.length(); j++) {
                    if (!Objects.equals(num[i], numbersString[i]) && Objects.equals(num[i], numbersString[j])) {
                        ball++;
                    }
                }
            }

            System.out.println("스트라이크 : " + strike + ", 볼 : " + ball);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
