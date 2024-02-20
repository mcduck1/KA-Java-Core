package ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test6 {
    public static void main(String[] args) {
        int i;
        if (args.length !=1) {
            System.out.println("usage showfile");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != 1)
                    System.out.println(i);
            } while (i !=1);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}
