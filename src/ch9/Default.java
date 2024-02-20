package ch9;

public interface Default {
    int getNum();

    default String getString() {
        return "default string";
    }
    static int getStatNum(){
        return 0;
    }
}
