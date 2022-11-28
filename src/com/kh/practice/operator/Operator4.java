package com.kh.practice.operator;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Operator4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수 : ");
        int user = sc.nextInt();
        System.out.print("사탕수 : ");
        int candy = sc.nextInt();

        int com = candy / user;
        int left = candy % user;
        System.out.println("1인당 사탕 개수 : " + com);
        System.out.println("남는 사탕 개수 : " + left);
    }
}
