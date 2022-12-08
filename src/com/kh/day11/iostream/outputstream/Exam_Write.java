package com.kh.day11.iostream.outputstream;

import com.kh.day11.iostream.inputstream.Exam_ReadByte;

import java.io.*;

public class Exam_Write {
    public static void main(String[] args) {
        OutputStream os = null;
        Exam_ReadByte er = new Exam_ReadByte();
        try {
            FileInputStream fi = new FileInputStream("src/iostream/outputStream.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            os = new FileOutputStream("src/iostream/outputStream.txt");
            byte[] data = "Hello I/O".getBytes();// getBytes()를 이용해 data에 byte로 내용을 넣어줌
            for(int i = 0 ; i <  data.length; i++){
                os.write(data[i]);
                os.flush();
            }

            System.out.println("쓰기 완료!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
