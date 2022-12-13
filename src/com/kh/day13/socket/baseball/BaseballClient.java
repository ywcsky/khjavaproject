package com.kh.day13.socket.baseball;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BaseballClient {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        Socket socket = null;
        int port = 8589;
        String address = "localhost";
        Scanner sc = new Scanner(System.in);
        try {
            socket = new Socket(address,port);
            System.out.println("클라이언트 소켓을 생성하였습니다.");
            is = socket.getInputStream();
            os = socket.getOutputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);
                System.out.println("게임 준비 완료");
while (true){
                // 값 보내기
                System.out.print("-->");
                String input = sc.nextLine();
                dos.writeUTF(input);

                //값 받기
                String resultMsg = dis.readUTF();
                System.out.println(resultMsg);
                if(resultMsg.startsWith("3")){
                    System.out.println("아웃으로 게임 종료");
                    break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                os.close();
                dis.close();
                dos.close();
                socket.close();
                sc.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
