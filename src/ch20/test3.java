package ch20;

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private int code;

    public Address(String name, String street, String city, String state, int code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name +"\n" + street + "\n" + city + " " + state + " " + code;
    }
}
public class test3 {
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<>();
        m1.add(new Address("J.W. West","11 Oak ave", "Urbana", "IL", 61801));
        m1.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", 61853));
        m1.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", 61820));
        for (Address element: m1)
            System.out.println(element + "\n");
    }
}