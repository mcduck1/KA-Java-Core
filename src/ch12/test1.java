package ch12;
enum Apple {Jonathan, GoldenDel, RedDel, Winesap, Cortland}

public class test1 {
    public static void main(String[] args) {
        Apple [] allapples = Apple.values();
        for(Apple a: allapples) {
            System.out.println(a);
        }

        Apple ap = Apple.valueOf("GoldenDel");
        System.out.println(ap);

    }
}
