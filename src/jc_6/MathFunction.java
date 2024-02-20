package jc_6;

public class MathFunction {
    private class Square extends Function {
        public int function(int n) {
            return n * n;
        }
    }

    private class Cube extends Function {
        public int function(int n) {
            return n * n * n;
        }
    }

    public Function getSqure() {
        return new Square();
    }

    public Function getCube() {
        return new Cube();
    }


}

