package chapter14;

class Gener1 <T> {
    T ob;
    Gener1 (T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }
}
class Gener2 <T> extends Gener1 <T> {
    Gener2 (T o) {
        super(o);
    }
}

public class test3 {
    public static void main(String[] args) {
        Gener1<Integer> gob1 = new Gener1<>(11);
        Gener2<Integer> gobint2 = new Gener2<Integer>(22);
        Gener2<String> gobstr2 = new Gener2<String>("string");
        if (gobint2 instanceof Gener2<?>)
            System.out.println("gobint2 is instance of Gener2");
        if (gobint2 instanceof Gener1<?>)
            System.out.println("gobint2 is instance of Gener1");
        if (gobstr2 instanceof Gener2<?>)
            System.out.println("gobstr2 is instance of Gener2");
        if (gobstr2 instanceof Gener1<?>)
            System.out.println("gobstr2 is instance of Gener1");
        if (gob1 instanceof Gener2<?>)
            System.out.println("gob1 is instance of Gener2");
        if (gob1 instanceof Gener1<?>)
            System.out.println("gob1 is instance of Gener1");
    }
}
