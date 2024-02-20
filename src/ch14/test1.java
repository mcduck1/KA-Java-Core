package ch14;
class Generic <T> {
    T ob;
    Generic (T o) {
        ob = o;
    }
    T getOb (){
        return ob;
    }
    void showType () {
        System.out.println("Type of T object is " + ob.getClass().getName());
    }
}
public class test1 {
    public static void main(String[] args) {
        Generic<Integer> iob = new Generic<>(88);
        int i = iob.getOb();
        System.out.println(i);
        iob.showType();

        Generic<String> sob = new Generic<>("test string");
        String s = sob.getOb();
        System.out.println(s);
        sob.showType();
    }
}
