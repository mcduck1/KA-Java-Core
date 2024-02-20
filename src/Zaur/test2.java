package Zaur;

public class test2 {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println(myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Random number: " + myNum.getValue());
        System.out.println("Another random number: " + myNum.getValue());
    }
}

interface MyNumber {
    double getValue ();
}
