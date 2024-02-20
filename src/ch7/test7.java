package ch7;
class Stack {
    private int[] stk;
    private int tos;
    Stack (int size){
        stk = new int[size];
        tos = -1;
    }
    void push (int item) {
        if(tos == stk.length-1)
            System.out.println("stack is full");
        else
            stk[++tos] = item;

    }
    int pop () {
        if (tos < 0) {
            System.out.println("stack is empty");
            return 0;
        }
        else
            return stk[tos--];
    }
}
public class test7 {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);
        for (int i = 0; i < 5; i++)
            myStack1.push(i);
        for (int i = 0; i < 8; i++)
            myStack2.push(i);
        System.out.println("stack in mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());
        System.out.println("stack in mystack2: ");

        System.out.println(myStack2.pop());
        System.out.println(myStack2.pop());
    }

}
