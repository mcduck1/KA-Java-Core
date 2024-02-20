package ch7;
class A {
    int i, j;
    A (int a, int b){
        i = a; j = b;
    }
    void show(){
        System.out.println("i and j are: " + i + " " + j);
    }
}
class B extends A {
    int k;
    B (int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String str){
        System.out.println(str + " k is: " + k);
    }
}
public class test12 {
    public static void main(String[] args) {
        B subOb = new B (1,2,3);
        subOb.show();
        subOb.show("Overriden");
    }
}
