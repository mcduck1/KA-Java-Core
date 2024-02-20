package ch7;
class t5 {
    int a;
    t5 (int a) {
        this.a = a;
    }
    t5 incByTen (){
        t5 temp = new t5(a+10);
        return temp;
    }
}
public class test5 {
    public static void main(String[] args) {
        t5 ob1 = new t5(2);
        System.out.println("ob1: " +ob1.a);
        t5 ob2;
        ob2 = ob1.incByTen();
        System.out.println("ob2: " + ob2.a);
        ob2 = ob2.incByTen();
        System.out.println("ob2 second increase: " + ob2.a);
    }
}
