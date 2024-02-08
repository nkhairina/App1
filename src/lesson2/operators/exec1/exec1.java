package lesson2.operators.exec1;

public class exec1 {
    int a = 5;
    int b = 7;

    public static void main(String[] args) {
        exec1 exec1Var = new exec1();
        exec1Var.exec1Calculate();
    }

    public void exec1Calculate() {
        int k = this.a + this.b - 10;
        boolean p = (a >= b);
        System.out.println("go");

        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        System.out.println(Math.ceil(squareRoot)); // Upper bound
        System.out.println(Math.floor(squareRoot)); // Lower bound
        System.out.println(Math.PI);
    }
}
