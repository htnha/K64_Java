package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriter {
    public static void write(String fileName, String s) {
        File file = new File(fileName);
        PrintWriter out = null;
        try {
            out = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("File khong tim thay");
        }
        out.println(s);
        out.close();
    }

    public static void read(String fileName){
        try {
            File file = new File(fileName);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("File khong tim thay.");
        }
    }

    public static void main(String[] args) {
        FileWriter.read("abc.txt");

    }

}
