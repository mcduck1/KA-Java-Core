package Zaur;

interface mi12 <T> {
    mc12 <T> func (int n);
}

class mc12 <T> {
    private T val;
    mc12 (T v) {
        val = v;
    }
    mc12 () {val = null;}

    T getVal () {return val;}
}

public class test12 {
    public static void main(String[] args) {
        mi12<Integer> myClassCons = mc12<Integer>::new;
        mc12<Integer> mc = myClassCons.func(100);
        System.out.println(mc.getVal());
    }
}
