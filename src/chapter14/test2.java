package chapter14;

class ng {
    int num;
    ng (int i) {
        num = i;
    }
    int getNum(){
        return num;
    }
}

class gene <T> extends ng {
    T ob;
    gene (T o, int i) {
        super(i);
        ob = o;
    }
    T getob () {
        return ob;
    }
}
public class test2 {
    public static void main(String[] args) {
        ng intob = new ng(88);
        gene<String> ngenob= new  gene<>("Non gen", 47);
        System.out.println(ngenob.getNum());
        System.out.println(ngenob.getob());
    }
}
