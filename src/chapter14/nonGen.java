package chapter14;

class NonGen {
    Object ob;
    NonGen (Object o) {
        ob = o;
    }
    Object getOb () {
        return ob;
    }

    void showType () {
        System.out.println("Type of ob " + ob.getClass().getName());
    }
}

class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb = new NonGen(88);
        int v = (Integer) iOb.getOb();
        System.out.println(v);
        iOb.showType();

        NonGen sOb = new NonGen("Non-Generic Test ");
        String s = (String) sOb.getOb();
        System.out.println(s);
        sOb.showType();

        iOb = sOb;
        int k = (Integer) iOb.getOb();
    }
}