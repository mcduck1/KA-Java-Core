package ch7;
class overload {
    void test (){
        System.out.println("no parameters");
    }
//    void test (int a) {
//        System.out.println("int a " + a);
//    }
    void test (int a, int b) {
        System.out.println("int a: " + a + " int b: " + b);
    }
    double test (double d) {
        System.out.println("double d: " + d);
        return d*d;
    }
}

public class test1 {
    public static void main(String[] args) {
        overload od = new overload();
        double result;
        od.test();
        od.test(10);
        od.test(10,20);
        result = od.test(25.5);
        System.out.println("result: " + result);
    }
}
