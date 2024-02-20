package chapter14;

class g1 <T> {
    T ob;
    g1 (T o) {
        ob = o;
    }
    T getOb () {
        System.out.print("g1's getob : " );
        return ob;
    }
}

class g2 <T> extends g1 <T> {
    g2 (T o) {
        super(o);
    }
    T getob () {
        System.out.print("g2's getob : ");
        return ob;
    }
}

public class test4 {
    public static void main(String[] args) {
        g1 <Integer> g1ob = new g1<>(11);
        System.out.println(g1ob.getOb());
        g2 <Integer> g2obint = new g2<Integer>(22);
        System.out.println(g2obint.getob());
        g2<String> g2obstr = new g2<String>("Java is fun");
        System.out.println(g2obstr.getob());
    }
}
