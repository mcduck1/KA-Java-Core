package ch10;
public class test3 {
    static void thowOne() throws IllegalAccessException{
        System.out.println("inside throw one");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        try {
            thowOne();
        } catch (IllegalAccessException e) {
            System.out.println("caught " + e);
        }
    }
}
