package Zaur;

interface StrFunc {
    String func (String s);
}

class MyStringOps {
    static String reverse (String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
}

public class test9 {
    static String strOp (StrFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String instr = "Lambdas adds power to Java";
        String outstr;
        outstr = strOp (MyStringOps::reverse, instr);
        System.out.println("original string: " + instr);
        System.out.println("reversed string: " + outstr);
    }
}
