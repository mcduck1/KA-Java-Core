package ch6;

class Stack {
    int [] stck = new int [10];
    int tos;
    Stack() {
        tos = -1;
    }
    void push (int i) {
        if (tos == 9)
            System.out.println("stack is full");
        else
            stck[++tos] = i;
    }
    int pop () {
        if (tos < 0) {
            System.out.println("stack is empty");
            return 0;
        }
        else
            return stck[tos--];
    }
}
public class test2 {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        for (int i = 0; i < 10; i++)
            myStack1.push(i);
        for (int i = 10; i < 20; i++)
            myStack2.push(i);
        System.out.println("in my stack: ");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());

        System.out.println("in my stack: ");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());

    }
}
