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

            // 값 보내기
            System.out.print("-->");
            String input = sc.nextLine();
            dos.writeUTF(input);




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
