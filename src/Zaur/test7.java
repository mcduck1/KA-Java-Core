package Zaur;

interface StringFunc {
    String func (String n);
}

public class test7 {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda is power to Java";
        String outStr;

//        outStr = stringOp((s) -> s.toUpperCase(), inStr);
//        System.out.println(outStr);
//
//        outStr = stringOp((s) -> {
//            String result = "";
//            for (int i = 0; i <s.length(); i++) {
//                if (s.charAt(i) != ' ')
//                    result = result + s.charAt(i);
//            }
//            return result;}, inStr);
//        System.out.println(outStr);

        StringFunc reverse = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result = result + s.charAt(i);
            }
            return result;};

        outStr = stringOp(reverse, inStr);
        System.out.println(outStr);
    }
}