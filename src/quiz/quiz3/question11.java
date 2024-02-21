package quiz.quiz3;

public class question11 {

    interface Perishable1 {
        default int maxDays() {
            return 1;
        }
    }

    interface Perishable2 extends Perishable1 {
        @Override
        default int maxDays() {
            return 2;
        }
    }

    class Milk implements Perishable2, Perishable1 {
    }

    public class Test {
        public static void main(String[] args) {
            Perishable1 obj = new Milk();
            System.out.println(obj.maxDays());
        }
    }

}