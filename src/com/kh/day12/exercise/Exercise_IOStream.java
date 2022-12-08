package com.kh.day12.exercise;

import java.io.*;
import java.util.Scanner;

public class Exercise_IOStream {
    public void fileCopy() {
        InputStream is = null;
        OutputStream os = null;
        //이미지파일복사
        try {
            is = new FileInputStream("C://img//img_minion.png");        // 복사할 파일경로
            os = new FileOutputStream("C://img2//img_minion.png");      // 붙여넣을 파일경로
            byte[] readBytes = new byte[100];                                 // 옮길 배열의 크기
            int readByteNO;                                                   // 배열의 번호
            is.read(readBytes);                                               // 파일의 내용을 배열에 넣음
            while ((readByteNO = is.read(readBytes)) != -1) {                 //  break 조건
                os.write(readBytes, 0, readByteNO);                       // 0부터 readByteNo 까지 readBytes의 내용을 입력
            }
            System.out.println("복사 완료");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void memoFileMake() {
        Writer fw = null;
        Scanner sc = new Scanner(System.in);

        System.out.print("저장할 파일명 입력 : ");
        String fileName = sc.next();
        try {
            fw = new FileWriter("C://img//" + fileName);
            int dataNo = 1;

            System.out.println("'" + fileName + "' 파일에 저장될 내용 입력 : ");
            System.out.println("종료는 exit");
            while(true){
                System.out.print(dataNo + " : ");
                String content = sc.nextLine() + "\n";
                if(content.equals("exit\n")) break;
                fw.write(content);
                dataNo++;
            }
            System.out.println("파일 저장 완료");
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
