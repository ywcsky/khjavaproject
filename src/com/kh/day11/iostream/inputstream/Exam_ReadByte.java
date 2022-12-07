package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream("src/iostream/inputStream.txt"); // 업캐스팅
            int readByteNo;
            byte[] readBytes = new byte[3];                             // 배열선언
            String data = " ";                                          // 복합대입연산자를 위한 선언
            while (true) {
                readByteNo = is.read(readBytes);                        // read(byte[]) 는 읽은 갯수를 저장 = readByteNo에 할당 / 3
                if (readByteNo == -1) break;                            // 데이터가 없을때 종료
                data += new String(readBytes, 0, readByteNo);    // String(byte[], num1, num2) 배열안 내용을 num1부터 num2까지 data에 넣음
            }
            System.out.println(data);                                   // 출력
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
