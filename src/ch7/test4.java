package ch7;
class prim {
    int a;
    int b;
    prim (int a, int b) {
        this.a = a;
        this.b = b;
    }
    void meth (prim o) {
        o.a *= 2;
        o.b /= 2;
    }
}
public class test4 {
    public static void main(String[] args) {
        prim ob = new prim(15,20);
        System.out.println("a and b before " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("a and b after " + ob.a + " " + ob.b);
    }
}
