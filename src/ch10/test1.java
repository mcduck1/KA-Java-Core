package ch10;

public class test1 {
    public static void main(String[] args) {
        int a, b;
        a = 42;
        try {
            b = a / 0;
            System.out.println("this won't print out");
        }
        catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        System.out.println("after catch statement");
    }
}
