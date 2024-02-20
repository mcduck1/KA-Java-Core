package ch7;
class t7 {
    int fact (int n) {
        if (n == 1)
            return 1;
        int result;
        result = fact(n-1)*n;
        return result;
    }
}
public class test6 {
    public static void main(String[] args) {
        t7 ob = new t7();
        System.out.println(ob.fact(1));
        System.out.println(ob.fact(3));
        System.out.println(ob.fact(4));
        System.out.println(ob.fact(5));
    }
}
