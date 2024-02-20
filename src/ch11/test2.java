package ch11;
class Callme {
    void  call (String msg) {
        System.out.printf("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("caught");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    Callme c;
    String s;
    Thread t;
    public Caller (Callme c, String s) {
        this.c = c;
        this.s = s;
        t = new Thread(this);
    }
    public void run () {
        synchronized (c) {
            c.call(s);
        }
    }
}
public class test2 {
    public static void main(String[] args) {
        Callme cme = new Callme();
        Caller ob1 = new Caller(cme, "Hello");
        Caller ob2 = new Caller(cme, "Synchronized");
        Caller ob3 = new Caller(cme, "World");
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("interrupted" + e);
        }
    }
}
