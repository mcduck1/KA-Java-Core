package ch13;
public class test10 {
    int a, b;
    test10 (int i, int j) {
        a = i ;
        b = j;
    }
    test10 (int i) {
        this (i, i);
    }
    test10 () {
        this (0);
    }

    public static void main(String[] args) {
        test10 t10 = new test10(100,200);
    }
}
