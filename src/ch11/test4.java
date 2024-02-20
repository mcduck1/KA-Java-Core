package ch11;
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A interrupted");
        }
        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last");
    }
}
class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B interrupted");
        }
        System.out.println(name + " trying to call A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside B.last");
    }
}

public class test4 implements Runnable {
    A a = new A();
    B b = new B();
    Thread t;
    test4 () {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this, "Racing Thread");
    }
    void DeadlockStart (){
            t.start();
            a.foo(b);
            System.out.println("back in main thread");
    }
    public void run (){
            b.bar(a);
            System.out.println("back in other thread");
    }

    public static void main(String[] args) {
        test4 dl = new test4();
        dl.DeadlockStart();
    }
}
