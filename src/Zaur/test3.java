package Zaur;

interface NumericTest {
    boolean test (int n);
}

public class test3 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10))
            System.out.println("10: is even"  );

        if (!isEven.test(9))
            System.out.println("9: is not even");

        NumericTest isNegative = (n) -> (n>= 0);
        if (isNegative.test(1))
            System.out.println("1: is positive");
        if (!isNegative.test(-1))
            System.out.println("-1: is negative");
    }
}
