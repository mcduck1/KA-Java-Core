package ch8;

class Box {
    private double width;
    private double height;
    private double depth;
    Box (Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
    BoxWeight(double len ,double m){
        super(len);
        weight = m;
    }
}
class Shipment extends BoxWeight {
    double cost;
    Shipment (Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w, double h, double d, double m, double c){
        super(w,h,d,m);
        cost = c;
    }
    Shipment(){
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
public class test2 {
    public static void main(String[] args) {
//        BoxWeight box1 = new BoxWeight(10, 20, 15, 34.3);
//        BoxWeight box2 = new BoxWeight(2,3,4,0.076);
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(3,2);
//        BoxWeight myclone = new BoxWeight(box1);
//        double vol1 = box1.volume();
//        double vol2 = box2.volume();
//        double vol3 = box3.volume();
//        double vol4 = box3.volume();
//        double vol5 = myclone.volume();
//        System.out.println("vol1: " + vol1);
//        System.out.println("w1: " + box1.weight);
//        System.out.println("vol2: " + vol2);
//        System.out.println("w2: " + box2.weight);
//        System.out.println("vol3: " + vol3);
//        System.out.println("w3: " + box3.weight);
//        System.out.println("vol4: " + vol4);
//        System.out.println("w4: " + box4.weight);
//        System.out.println("vol5: " + vol5);
//        System.out.println("w5: " + myclone.weight);
        Shipment ship1 = new Shipment(20, 10, 15, 10, 3.41);
        double vol1 = ship1.volume();
        System.out.println("shipment1 volume is " + vol1);
        System.out.println("shipment1 weight is " + ship1.weight);
        System.out.println("shipment1 cost is $" + ship1.cost);

        Shipment ship2 = new Shipment(2,3,4,0.76,1.28);
        double vol2 = ship2.volume();
        System.out.println("shipment2 volume is " + vol2);
        System.out.println("shipment2 weight is " + ship2.weight);
        System.out.println("shipment2 cost is $" + ship2.cost);

    }
}
