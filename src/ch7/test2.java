package ch7;
class Box {
    double width;
    double height;
    double depth;
    Box () {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box (double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box (double len) {
        width = height = depth = len;
    }
    Box (Box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }
    double volume () {
        return width * height * depth;
    }
}
public class test2 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(10, 20, 30);
        Box box3 = new Box(20);
        Box cloneBox = new Box(box2);
        double vol1 = box1.volume();
        double vol2 = box2.volume();
        double vol3 = box3.volume();
        double vol4 = cloneBox.volume();
        System.out.println("vol1: " + vol1);
        System.out.println("vol2: " + vol2);
        System.out.println("vol3: " + vol3);
        System.out.println("vol4: " + vol4);
    }
}
