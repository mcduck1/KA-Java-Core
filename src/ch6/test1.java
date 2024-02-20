package ch6;

class Box {
    double width;
    double height;
    double depth;
    Box (double width, double height, double depth) {
        System.out.println("this is constructor ");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume () {
        return width * height * depth;
    }
}

public class test1 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box(3,6,9);
        double vol = myBox1.volume();
        System.out.println("box1 volume is " + vol);


        vol = myBox2.volume();
        System.out.println("box2 volume is " + vol);
    }
}
