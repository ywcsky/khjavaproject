package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {
    public static void main(String[] args) {
        InputStream is = null;

        try {
            is = new FileInputStream("src/iostream/inputStream.txt");
            int readByteNO;
            byte[] readBytes = new byte[8];
            readByteNO = is.read(readBytes, 0, 3);
            String str = "";
            for(int i = 0; i < readBytes.length; i++){
                str = new String(readBytes,0,5);
//                if (readByteNO = -1) break;
                System.out.print(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
