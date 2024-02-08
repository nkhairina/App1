package lesson2.operators.exec1;

public class exec2 {

    static double d;
    static double xff;
    static double yff;
    static double zff;
    static int x1 = 2;
    static int y1 = 1;
    static int z1 = 3;
    static int x2 = 0;
    static int y2 = 0;
    static int z2 = 6;

    public static void main(String[] args) {

        xff = Math.pow(x1 - x2, 2);
        yff = Math.pow(y1 - y2, 2);
        zff = Math.pow(z1 - z2, 2);
        d = Math.sqrt((xff + yff + zff));

        System.out.println(d);

    }
}
