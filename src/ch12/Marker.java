package ch12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
    int value();
}
class Marker {
    @MyMarker(100)
    public static void myMeth (){
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MyMarker anno = m.getAnnotation(MyMarker.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}