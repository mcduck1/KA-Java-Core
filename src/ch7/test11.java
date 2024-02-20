package ch7;
class MyClass {
    int i;
    MyClass (int k) {
        i = k;
    }
    int getMyClass () {
        return i;
    }
    void setMyClass (int k) {
        if (k >= 0)
            i = k;
    }
}
public class test11 {
    public static void main(String[] args) {
        var mc = new MyClass(10);
        System.out.println(mc.getMyClass());
        mc.setMyClass(20);
        System.out.println(mc.getMyClass());
    }
}
