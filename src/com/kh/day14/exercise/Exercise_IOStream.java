package com.kh.day14.exercise;

import java.io.*;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise_IOStream {
    static Scanner sc = new Scanner(System.in);
    private static String name, address;
    private static int age;
    static InputStream is = null;
    static Writer os = null;


    public static void main(String[] args) {
        end:
        while (true) {
            int choice = menu();
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
                    break end;
                default:
                    System.out.println("0~4 사이의 숫자 입력해주세요.");
            }
        }

    }

    public static int menu() {
        System.out.println("1. 정보입력");
        System.out.println("2. 정보출력");
        System.out.println("3. 정보저장(save)");
        System.out.println("4. 정보불러오기(load)");
        System.out.println("0. 종료");
        System.out.print("메뉴입력 : ");
        int select = sc.nextInt();
        System.out.println("=== === === === === ===");
        return select;

    }

    public static void insert() {
        System.out.print("이름 : ");
        name = sc.next();
        System.out.print("나이 : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("주소 : ");
        address = sc.nextLine();
    }

    public static void print() {
        System.out.println("======= 정보 출력 =======");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("=== === === === === ===");
    }

    public static void save() {
        try {
            Writer os = new FileWriter("src/iostream/" + name + ".txt");
            String result = name + "/" + age + "/" + address;
            os.write(result);
            System.out.println("저장 완료");
            System.out.println("=== === === === === ===");
            os.flush();
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void load() {
        String result = "";
        try {
            BufferedReader bfReader = null;
            System.out.println("파일명 입력");
            String fileName = sc.next();
            Reader reader = new FileReader("src/iostream/" + fileName + ".txt");
            bfReader = new BufferedReader(reader);
            result = bfReader.readLine();
            //1. split(), 2. StringTokenizer
            StringTokenizer st = new StringTokenizer(result,"/");
            name = st.nextToken();
            age = Integer.parseInt(st.nextToken());
            address = st.nextToken();
            System.out.println("로드 완료");
            System.out.println("=== === === === === ===");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
