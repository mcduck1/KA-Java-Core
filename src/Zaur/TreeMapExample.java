package Zaur;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap <Student, Integer> tm = new TreeMap<>();
        TreeMap <Student, Integer> tm2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        Student st1 = new Student("Zaur", "Tregulov", 2);
        Student st2 = new Student("Adilbek", "Jartybayev", 4);
        Student st3 = new Student("Bazan", "Nurakhmetov", 3);
        tm.put(st1, 5);
        tm.put(st2, 3);
        tm.put(st3, 2);
        System.out.println(tm);
        Student st4 = new Student("Bazan", "Nurakhmetov", 3);

        System.out.println(tm.firstEntry() );
    }
}
