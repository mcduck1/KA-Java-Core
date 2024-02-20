package ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("type in text:");
        do {
            str = br.readLine();
            System.out.println(str);
        }
        while (!str.equals("stop"));
    }
}
