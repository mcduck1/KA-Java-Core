package Zaur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyClass {
    private int val;

    public MyClass(int val) {
        this.val = val;
    }

    int getVal() {
        return val;
    }
}

class UseMethodRef {
    static int compare (MyClass a, MyClass b)
    {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(7));
        MyClass maxValObj = Collections.max(al, UseMethodRef::compare);
        System.out.println(maxValObj.getVal());
    }
}