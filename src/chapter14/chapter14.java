package chapter14;

class Gen <T> {
    T ob;
    Gen (T o) {
        ob = o;
    }
    T getOb () {
        return ob;
    }

    void showType () {
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}

public class chapter14 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        System.out.println(iOb.getOb());
        iOb.showType();

        Gen<String> sOb = new Gen<>("Generics Test");
        System.out.println(sOb.getOb());
        sOb.showType();
    }

}
