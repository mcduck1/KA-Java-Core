package ch13;

import java.io.PrintWriter;

public class test4 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        String str = "Test code";
        pw.println(str);
        int a = 10;
        pw.println(a);
        double d = 4.5e-7;
        pw.println(d);
    }
}
