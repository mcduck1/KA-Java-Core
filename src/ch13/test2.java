package ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = new String[100];
        System.out.println("enter your text:");
        System.out.println("enter 'stop' to quit");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) break;
        }
        System.out.println("here is your file: ");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
