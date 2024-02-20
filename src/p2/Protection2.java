package p2;

import p1.Protection;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("derived othe constuctor package");
//        System.out.println("n = " + n);
//        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
