package com.kh.day14.exercise.oop;

public class IOStream extends IOStreamFunction{
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
    }

