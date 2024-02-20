package chapter14;

class Ge <T> {
    T ob;
    Ge (T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }
}
class Gen2 <T, V> extends Ge<T> {
    V ob2;
    Gen2 (T o1, V o2) {
        super (o1);
        ob2 = o2;
    }
    V getOb2 () {
        return ob2;
    }
}
public class test1 {
    public static void main(String[] args) {
        Ge <Integer>iob = new Ge<>(88);
        Gen2 <String, Integer> iob2 = new Gen2<>("Hello world", 99);
        System.out.println(iob.getOb());
        System.out.println(iob2.getOb());
        System.out.println(iob2.getOb2());
    }
}
