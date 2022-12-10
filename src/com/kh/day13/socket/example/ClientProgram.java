package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        InputStream is = null;

        try {
            System.out.println("연결 요청 중..");
            socket = new Socket("127.0.0.1", 4885);
            System.out.println("연결 성공!");
            Scanner sc = new Scanner(System.in);

            while (true) {
                ////////// 데이터 보내기 //////////
                byte[] buf = null;
                String message = "";
                os = socket.getOutputStream();
                System.out.print("메시지 입력 : ");
                message = sc.nextLine();
                if ("exit".equals(message)) break;
                buf = message.getBytes();
                os.write(buf);
                os.flush();
                System.out.println("데이터 전송 완료");
                /////////////////////////////////
                is = socket.getInputStream();
                byte[] bytes = new byte[100];
                int readByteNo = is.read(bytes);
                message = new String(bytes, 0, readByteNo);
                System.out.println("데이터 받기 성공 : " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
