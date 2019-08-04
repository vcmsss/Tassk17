package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        while (true) {
            System.out.print("Input text. For stop say Stop: ");
            String a = in.nextLine();


            try {
                FileWriter writer = new FileWriter("TXT.txt");
                writer.write(a);
                writer.close();
            } catch (IOException ex) {
                System.out.println("Error: + ex");



            }
            if (a.equals("Stop")) {
                break;
            }
        }

    }
}
