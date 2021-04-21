package com.gibrilla;
import java.io.*;
public class Copyfiles {
    public static void main(String[] args) throws IOException {
        {
            FileReader fr = null;
            try {
                fr = new FileReader("Work.txt");
                FileWriter fw = new FileWriter("Copy.txt");
            } catch (IOException e) {
                e.printStackTrace();
                int i;
                while ((i = fr.read())) ;
            }
        }
    }
}
