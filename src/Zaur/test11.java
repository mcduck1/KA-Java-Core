package Zaur;

interface function11 <T> {
    int f11 (T[] vals, T v);
}

class MyArrayOps {
    static <T> int countMatching (T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v)
                count++;
        }
        return count;
    }
}

public class test11 {
    static <T> int myOp (function11 <T> f, T[] vals, T v) {
        return f.f11(vals, v);
    }

    public static void main(String[] args) {
        Integer [] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String [] strs = {"one", "two", "three", "four"};

        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("vals contains " + count + " 4s");

        count = myOp(MyArrayOps::<String>countMatching, strs, "two");
        System.out.println("strs contains " + count + " twos");
    }
}
