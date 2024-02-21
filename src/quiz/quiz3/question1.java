package quiz.quiz3;

public class question1 {

    public static void main(String[] args) {
        int ctr = 100;
        one: for (int i = 0; i < 10; i++) {
            two: for (int j = 0; j < 7; j++) {
                three: while (true) {
                    if (i > j) {
                        break one;
                    } else if (i == j) {
                        break two;
                    } else {
                        break three;
                    }
                    ctr++;
                }
            }
        }
        System.out.println(ctr);
    }
}
