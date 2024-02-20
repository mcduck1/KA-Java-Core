package ch8;
class A {
    int i, j;

    void showij() {
        System.out.println("i and j are " + i + " " + j);
    }
}
class B extends A {
    int k;
    void showk(){
        System.out.println("k is " + k);
    }
    void sum (){
        System.out.println("i and j and k sum is " + (i+j+k));
    }
}
public class test1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.i = 1;
        a.j = 2;
        System.out.println("content of superclass is " );
        a.showij();
        System.out.println();
        b.i = 11;
        b.j = 12;
        b.k = 13;
        System.out.println("content of subclass is ");
        b.showij();
        b.showk();
        System.out.println();
        b.sum();
    }
}
