package jc_6;

public abstract class Function {
    public abstract int function (int n);

    public int calculate (int begin, int end) {
        return function(begin) - function(end);
    }
}
