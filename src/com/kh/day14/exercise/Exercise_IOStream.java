package com.kh.day14.exercise;

import java.io.*;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise_IOStream {
    static Scanner sc = new Scanner(System.in);
    static String name, address;
    static int age;
    static InputStream is = null;
    static OutputStream os = null;
    static DataOutputStream dos = new DataOutputStream(os);


    public static void main(String[] args) {
        int end = 0;
        while (true) {
            System.out.println("1. 정보입력");
            System.out.println("2. 정보출력");
            System.out.println("3. 정보저장(save)");
            System.out.println("4. 정보불러오기(load)");
            System.out.println("0. 종료");
            System.out.print("메뉴입력 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    save();
                    break;
                case 4:
                    load();
                    break;
                case 0:
                    end = 1;
                    break;
            }
            if (end == 1) break;
        }

    }

    public static void insert() {
        sc.nextLine();
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("나이 : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("주소 : ");
        address = sc.nextLine();
    }

    public static void print() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
    }

    public static void save() {
        try {
            os = new FileOutputStream("src/file/" + name + ".txt");
            Writer writer = new FileWriter("src/file" + name + ".txt");
            writer.write(name +"/"+age +"/"+address);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void load() {
        System.out.println("파일명 입력");
        String fileName = sc.nextLine();
        try {
            Reader reader = new FileReader("scr/file/" + name + ".txt");
            String readData = String.valueOf(reader.read());
            String[] arr = readData.split("/");
            name = arr[0];
            age = Integer.parseInt(arr[1]);
            address = arr[2];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
