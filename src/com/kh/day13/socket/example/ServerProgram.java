package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        InputStream is = null;
        OutputStream os = null;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("연결 대기중...");
            serverSocket = new ServerSocket(4885);
            Socket socket = serverSocket.accept();
            System.out.println("연결 수락됨");
            while (true) {

                //// 데이터 받기 //////
                is = socket.getInputStream();
                byte[] bytes = new byte[100];
                int readBytesNo = is.read(bytes);
                String message = new String(bytes, 0, readBytesNo);
                System.out.println("데이터 받기 성공 : " + message);
                //////////////////////////
                // 데이터 보내기 //
                os = socket.getOutputStream();
                byte[] buf = null;
                System.out.print("메시지 입력 : ");
                message = sc.nextLine();
                if ("exit".equals(message)) break;
                buf = message.getBytes();
                os.write(buf);
                os.flush();
                System.out.println("데이터 전송 완료");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
