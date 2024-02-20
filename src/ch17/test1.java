package ch17;
public class test1 {
    public static void main(String[] args) {
        int r = 0;
        int l = 0;
        int u = 0;
        int d = 0;

        char direction = 'R';
        switch (direction) {
            case 'R' -> {
                System.out.println("turn right");
                r++;
            }
            case 'L' -> {
                System.out.println("turn left");
                l++;
            }
            case 'U' -> {
                System.out.println("turn up");
                u++;
            }
            case 'D' -> {
                System.out.println("turn down");
                d++;
            }
        }
        System.out.println(r);
    }
}
