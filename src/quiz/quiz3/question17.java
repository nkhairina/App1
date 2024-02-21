package quiz.quiz3;

public class question17 {

    public static void main(String[] args) {
        try {
            throw new Exception(); // Line n1
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage()); // Line n2
        } finally {
            System.out.println("This is finally block"); // Line n3
        }
        System.out.println("This line is after the try-catch block"); // Line n4
    }

}
