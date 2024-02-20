package ch11;
class newthread implements Runnable {
    String name;
    Thread t;
    newthread(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
    }
    public void run(){
        try {
            for (int i = 5; i>0; i--){
                System.out.println(name + ": " + i );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting");
    }
}
public class test1 {
    public static void main(String[] args) {
        newthread nt1= new newthread("one");
        newthread nt2= new newthread("two");
        newthread nt3= new newthread("three");
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        System.out.println("Thread One is alive: " + nt1.t.isAlive());
        System.out.println("Thread Two is alive: " + nt2.t.isAlive());
        System.out.println("Thread Three is alive: " + nt3.t.isAlive());
        try {
            System.out.println("Waiting for threads to finish");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Thread One is alive: " + nt1.t.isAlive());
        System.out.println("Thread Two is alive: " + nt2.t.isAlive());
        System.out.println("Thread Three is alive: " + nt3.t.isAlive());
        System.out.println("Main Thread exiting");
    }
}
