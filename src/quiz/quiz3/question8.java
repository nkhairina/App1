package quiz.quiz3;

public class question8 {

    public static void main(String[] args) {
        int score = 30; // Line n1

        char grade = 'F'; // Line n2

        if (50 <= score < 60) { // Line n3

            grade = 'D';

        } else if (60 <= score < 70) { // Line n4

            grade = 'C';

        } else if (70 <= score < 80) { // Line n5

            grade = 'B';

        } else if (score >= 80) { // Line n6

            grade = 'A';

        }

        System.out.println(grade); // Line n7

    }

}
