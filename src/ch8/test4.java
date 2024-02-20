package ch8;
abstract class W {
    abstract void callme();
    void callmetoo(){
        System.out.println("This is a concrete method");
    }
}
class E extends W {
    void callme(){
        System.out.println("E's implementation of callme");
    }
}
public class test4 {
    public static void main(String[] args) {
        E e = new E();
        e.callme();
        e.callmetoo();
    }
}
