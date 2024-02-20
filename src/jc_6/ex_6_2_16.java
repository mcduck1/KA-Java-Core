package jc_6;

public class ex_6_2_16 {
    public static void main(String[] args) {
        MathFunction mf = new MathFunction();
        System.out.println(calculate(mf.getSqure(),1,4));
        System.out.println(calculate(mf.getCube(),1,4));
    }
    public static int calculate(Function fun, int begin, int end) {
        return fun.calculate(begin, end);
    }

}

