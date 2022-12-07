package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
    public static void main(String[] args) {
        InputStream is = null;

        // Checked Exception
        // 반드시 try ~ catch 해줘야 하는 Exception
        try {
            is = new FileInputStream("src/iostream/inputStream.txt");
            int readByte;
            while(true){
                readByte = is.read();
                if(readByte == -1) break; // 파일에 내용이 없을때 -1 반환됨
                System.out.print((char) readByte);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}