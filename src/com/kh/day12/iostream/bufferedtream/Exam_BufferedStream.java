package com.kh.day12.iostream.bufferedtream;

import java.io.*;
import java.util.Scanner;

public class Exam_BufferedStream {
    public static void main(String[] args) {
        FileReader fr = null;
        int c;

        try {
            fr = new FileReader("C://img//img.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
            while ((c = fr.read()) != -1) {
                out.write(c);
            }

            new Scanner(System.in).nextLine();
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
