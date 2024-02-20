package ch7;
class Test {
    int i, j;
    Test (int a, int b){
        i = a;
        j = b;
    }
    boolean equalTo (Test o) {
        if (i == o.i && j == o.j)
            return true;
        else
            return false;
    }
}
public class test3 {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(200, 20);
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
