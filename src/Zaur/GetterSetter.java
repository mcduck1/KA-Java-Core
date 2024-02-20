package Zaur;

public class GetterSetter {
    int x;
    GetterSetter (int x) {
        this.x = x;
    }
    int get () {
    return x;}

    public static void main(String[] args) {
        GetterSetter test = new GetterSetter(9);
        System.out.println(test.get());
    }
}


