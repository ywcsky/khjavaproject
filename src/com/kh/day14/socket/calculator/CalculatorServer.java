package com.kh.day14.socket.calculator;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        int port = 8989;
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;

        try {
            System.out.println("서버 구동중..");
            Thread.sleep(2000);
            serverSocket = new ServerSocket(port);
            System.out.println("클라이언트 연결을 기다리는중...");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 연결됨");
            is = socket.getInputStream();
            os = socket.getOutputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);
            while (true) {
                //데이터 받기
                String msg = dis.readUTF();
                if(msg.equalsIgnoreCase("bye")){
                    System.out.println("클라이언트가 종료함");
                    break;
                }
                System.out.println("받은 메시지 : " + msg);
                String[] msgArrs = msg.split(" ");
                if(msgArrs.length != 3){
                    msg = "end";
                    dos.writeUTF(msg);
                    continue;
                }
                int num1 = Integer.parseInt(msgArrs[0]);
                String operator = msgArrs[1];
                int num2 = Integer.parseInt(msgArrs[2]);
                String result;
                switch (operator) {
                    case "+":
                        result = num1 + num2 + "";
                        break;
                    case "-":
                        result = num1 - num2 + "";
                        break;
                    case "*":
                        result = num1 * num2 + "";
                        break;
                    case "/":
                        result = num1 / num2 + "";
                        break;
                    case "%":
                        result = num1 % num2 + "";
                        break;
                    default:
                        result = "잘못된 값을 입력함";
                        break;
                }

                // 데이터 보내기
                dos.writeUTF(result);

            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
