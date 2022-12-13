package com.kh.day13.socket.baseball;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        Date date = new Date();
        SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
        try {
            System.out.println("서버소켓을 생성하였습니다.");
            serverSocket = new ServerSocket(port);
            Thread.sleep(2000);
            System.out.println(trans.format(date));
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


            System.out.println("서버 숫자 ->" + numbers[0] + " " + numbers[1] + " " + numbers[2]);
            System.out.println("숫자 준비 완료");

            while(true) {
            // 값 받기
            String readNum = dis.readUTF();
            System.out.println("받기 : " + readNum);
            // 받은 값이 numbers의 값과 비교했을때
            // 숫자가 맞고 위치가 맞는지
            // 숫자는 맞는데 위치는 틀린지
            // 아무것도 맞지 않았는지
            // 스트라이크, 볼로 출력한다.
            // 1. 배열과 배열 비교
            //split을 통한 숫자값을 배열로 저장
//
//                String[] num = new String[3];
//                for (int i = 0; i < readNum.length(); i++) {
//                    num[i] = String.valueOf(readNum.charAt(i));
//                    System.out.println("받은 값 : " + num[i]);
//                }
//
//
//                for (int i = 0; i < readNum.length(); i++) {
//                    if (num[i].equals(numbersString[i])) {
//                        strike++;
//                    }
//                    for (int j = 0; j < readNum.length(); j++) {
//                        if (!Objects.equals(num[i], numbersString[i]) && Objects.equals(num[i], numbersString[j])) {
//                            ball++;
//                        }
//                    }
//                }
            int strike = 0, ball = 0;

            String[] readNums = readNum.split("");
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < readNums.length; j++) {
                    if (numbers[i] == Integer.parseInt(readNums[j])) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }
            // 클라이언트로 결과값 보내주기
            String result = strike + "스트라이크 , " + ball + "볼";
            dos.writeUTF(result);
            // 스트라이크가 3이면 게임 종료
                if(strike == 3)break;
                }

        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            try{
                dos.close();
                dis.close();
                is.close();
                os.close();
                serverSocket.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
