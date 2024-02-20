package ch10;

public class chatgpt1 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};

        try{
            a[5] = 5;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("indexout of bound " + e);
        }
    }
}
