package com.kh.day13.socket.chatting;

import javafx.beans.property.StringProperty;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        int port = 8507;
        InputStream is = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("서버 구동중..");
            Thread.sleep(2000);
            serverSocket = new ServerSocket(port);
            System.out.println("채팅서버를 구동하였습니다.");
            Thread.sleep(2000);
            System.out.println("클라이언트의 접속 기다리는 중..");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 접속하였습니다.");
            is = socket.getInputStream();
            dis = new DataInputStream(is);
            os = socket.getOutputStream();
            dos = new DataOutputStream(os);
            System.out.println("채팅이 시작되었습니다.");
            while (true) {
                System.out.print("서버(나) : ");
                String message = sc.nextLine();
                if ("exit".equals(message)) break;
                dos.writeUTF(message);

                String recvmessage = dis.readUTF();
                System.out.println("클라이언트(상대) : " + recvmessage);
                if ("exit".equals(recvmessage))
                    System.out.println("상대방이 나갔습니다.");
                break;

            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
