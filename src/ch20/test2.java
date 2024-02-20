package ch20;

import java.util.LinkedList;

public class test2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add("A2");
        System.out.println(ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.set(2, "new element");
        System.out.println(ll);
    }
}
