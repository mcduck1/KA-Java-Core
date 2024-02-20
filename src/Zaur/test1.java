package Zaur;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class test1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 2);
        Student st2 = new Student("Adilbek", "Jartybayev", 4);
        Student st3 = new Student("Bazan", "Nurakhmetov", 3);

        map.put(st1, 9.5);
        map.put(st2, 2.0);
        map.put(st3, 3.0);
//
//        for (Map.Entry<Student, Double> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        System.out.println(map.values());

//        System.out.println(map);
    }
}

