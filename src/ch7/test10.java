package ch7;

public class test10 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int ...): " + "Number of args " + v.length + " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...): " + "Number of args " + v.length + " Contents: ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest(String str, int ... v) {
        System.out.print("vaTest(String and int ...): " + "Number of args " + v.length + " Contents: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(10,20,30,40,50);
        vaTest(true, false, true);
        vaTest("Third: ", 1, 2, 3, 4);
    }
}
