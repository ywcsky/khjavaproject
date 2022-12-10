package com.kh.day13.socket.chatting;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
    public static void main(String[] args) {
        String address = "192.168.160.15";
        int port = 8507;
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("서버에 연결중입니다.");
            Thread.sleep(2000);
            Socket socket = new Socket(address, 8507);
            System.out.println("채팅서버에 연결하였습니다.");
            is = socket.getInputStream();
            os = socket.getOutputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);
            System.out.println("서버와의 채팅을 시작합니다.");
            String message;
            while (true) {
                message = dis.readUTF();
                if ("exit".equals(message)){
                    System.out.println("상대방이 나갔습니다.");
                break;
            }
            System.out.println("서버(상대) : " + message);

            System.out.print("클라이언트(나) : ");
            String sendMessage = sc.nextLine();
            dos.writeUTF(sendMessage);
            if ("exit".equals(sendMessage)) break;
        }
        } catch (UnknownHostException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }



    }
}
