package ch9;

class DefImp implements Default {
    public int getNum() {
        return 100;
    }
    public String getString (){
        return "this is different implementation";
    }
    public int getStatNum(){
        return 1;
    }
}
public class test1 {
    public static void main(String[] args) {
        DefImp di = new DefImp();
        System.out.println(di.getNum());
        System.out.println(di.getString());
        System.out.println(di.getStatNum());
        System.out.println(Default.getStatNum());

    }
}
