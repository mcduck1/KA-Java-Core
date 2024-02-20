package ch8;
abstract class Figure {
    double a;
    double b;
    Figure (int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract double area ();
}
class Rectangle extends Figure {
    Rectangle(int a, int b){
        super(a, b);
    }
    double area(){
        System.out.println("rectange area is ");
        return a*b;
    }
}
class Triangle extends Figure {
    Triangle(int a, int b){
        super(a, b);
    }
    double area(){
        System.out.printf("triangle area is ");
        return a*b/2;
    }
}
public class test3 {
    public static void main(String[] args) {
//        Figure f = new Figure(10, 20);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;
//        figref = f;
//        System.out.println("Area is " + f.area());
        figref = r;
        System.out.println("Area is " + r.area());
        figref = t;
        System.out.println("Area is " + t.area());
    }
}
