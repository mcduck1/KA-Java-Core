package ch13;
class A {
    int i,j;
}
class B {
    int i,j;
}
class C extends A {
    int k;
}
class D extends A {
    int k;
}
public class test7 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)
            System.out.println("a is instance of A");
        if (b instanceof B)
            System.out.println("b is instance of B");
        if (c instanceof C)
            System.out.println("c is instance of C");
        if (d instanceof D)
            System.out.println("d is instance of D");
        if (c instanceof A)
            System.out.printf("c is instance of A");
        if (a instanceof C)
            System.out.println("a is instance of C");
        System.out.println();
        A ob;
        ob = d;
        System.out.println("ob now refers to d");
        if (ob instanceof D)
            System.out.println("ob is instance of D");
        ob = c;
        System.out.println("ob now refers to c");
        if (ob instanceof C)
            System.out.println("ob is instance of C");
        if (ob instanceof A)
            System.out.println("ob is instance of A");
        if (a instanceof Object)
            System.out.println("a can be cast to Object");
        if (b instanceof Object)
            System.out.println("b can be cast to Object");
        if (c instanceof Object)
            System.out.println("c can be cast to Object");
        if (d instanceof Object)
            System.out.println("d can be cast to Object");
    }
}
