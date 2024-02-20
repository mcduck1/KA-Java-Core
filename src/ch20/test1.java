package ch20;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);
        int sum = 0;
        for (int i: ia)
            sum = sum + i;
        System.out.println(sum);
    }
}
