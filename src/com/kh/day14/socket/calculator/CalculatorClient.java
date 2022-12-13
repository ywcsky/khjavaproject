package com.kh.day14.socket.calculator;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        Scanner sc = new Scanner(System.in);
        try {
            socket = new Socket("localhost", 8989);
            System.out.println("서버와 연결됨");
            is = socket.getInputStream();
            os = socket.getOutputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);

            while(true) {
                System.out.print(">>");
                String inputVal = sc.nextLine();
                dos.writeUTF(inputVal);
                if(inputVal.equalsIgnoreCase("bye")){
                    System.out.println("종료함");
                    break;
                }

                String result = dis.readUTF();
                if(result.equalsIgnoreCase("end")){
                    System.out.println("잘못된 형식");
                    continue;
                }
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
