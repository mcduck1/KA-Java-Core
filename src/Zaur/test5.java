package Zaur;

interface NumericFun {
    int func (int n);
}

public class test5 {
    public static void main(String[] args) {
        NumericFun factorial = n -> {
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
