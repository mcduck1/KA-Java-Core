package Zaur;

interface SomeFunc <T> {
    T func (T t);
}

public class test6 {
    public static void main(String[] args) {
        SomeFunc <String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result = result + str.charAt(i);
            return result;
        };
        System.out.println("Lambda reversed is: " + reverse.func("Lambda"));
        System.out.println("Expression reversed is: " + reverse.func("Expression"));

        SomeFunc<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println("Factorial of 3 is: " + factorial.func(3));
        System.out.println("Factorial of 5 is: " + factorial.func(5));

    }
}
