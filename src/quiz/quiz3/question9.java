package quiz.quiz3;

public class question9 {

    public static void main(String[] args) {
        int x = 10, y = 11, z = 12; // Line 1
        for (; y > x && z > y; y++, z = 2) { // Line 2
            System.out.println(x + y + z); // Line 3
        }
    }
}
