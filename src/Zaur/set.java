package Zaur;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();

        Student st1 = new Student("Zaur", "Tregulov", 2);
        Student st2 = new Student("Adilbek", "Jartybayev", 4);
        Student st3 = new Student("Bazan", "Nurakhmetov", 3);
        Student st4 = new Student("Dauren", "Zhartybayev", 5);
        Student st5 = new Student("Kulanda", "Rakhimzhanova", 1);

        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);

        Student st6 = new Student("Alex", "Li", 2);
        Student st7 = new Student("Peter", "Tiel", 3);

        System.out.println(st6.equals(st1));
        System.out.println(st7.hashCode() == st3.hashCode());

        System.out.println(set);

        //127.0.0.1 24.kg
//127.0.0.1 bloomberg.com
//127.0.0.1 espn.go.com
//127.0.0.1 facebook.com
//127.0.0.1 finance.yahoo.com
//127.0.0.1 forbes.kz
//127.0.0.1 inform.kz
//127.0.0.1 informburo.kz
//127.0.0.1 instagram.com
//127.0.0.1 kazinform.kz
//127.0.0.1 kolesa.kz
//127.0.0.1 korter.kz
//127.0.0.1 krisha.kz
//127.0.0.1 kurs.kz
//127.0.0.1 kursiv.kz
//127.0.0.1 liter.kz
//127.0.0.1 lsm.kz
//127.0.0.1 mig.kz
//127.0.0.1 netflix.com
//127.0.0.1 nur.kz
//127.0.0.1 nytimes.com
//127.0.0.1 strava.com
//127.0.0.1 tengrinews.kz
//127.0.0.1 valuta.kz
//127.0.0.1 vimeo.com
//127.0.0.1 vlast.kz
//127.0.0.1 vse.kz
//127.0.0.1 washingtonpost.com
//127.0.0.1 wsj.com
// 127.0.0.1 youtube.com
//127.0.0.1 zakon.kz

//127.0.0.1 www.24.kg
//127.0.0.1 www.bloomberg.com
//127.0.0.1 www.espn.go.com
//127.0.0.1 www.facebook.com
//127.0.0.1 www.finance.yahoo.com
//127.0.0.1 www.forbes.kz
//127.0.0.1 www.inform.kz
//127.0.0.1 www.informburo.kz
//127.0.0.1 www.instagram.com
//127.0.0.1 www.kazinform.kz
//127.0.0.1 www.kolesa.kz
//127.0.0.1 www.korter.kz
//127.0.0.1 www.krisha.kz
//127.0.0.1 www.kurs.kz
//127.0.0.1 www.kursiv.kz
//127.0.0.1 www.liter.kz
//127.0.0.1 www.lsm.kz
//127.0.0.1 www.mig.kz
//127.0.0.1 www.netflix.com
//127.0.0.1 www.nur.kz
//127.0.0.1 www.nytimes.com
//127.0.0.1 www.strava.com
//127.0.0.1 www.tengrinews.kz
//127.0.0.1 www.valuta.kz
//127.0.0.1 www.vimeo.com
//127.0.0.1 www.vlast.kz
//127.0.0.1 www.vse.kz
//127.0.0.1 www.washingtonpost.com
//127.0.0.1 www.wsj.com
//127.0.0.1 www.youtube.com
//127.0.0.1 www.zakon.kz

    }
}


