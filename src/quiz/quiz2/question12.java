package quiz.quiz2;

public class question12 {

    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.err.println("APPLE");
            case "Mango":
                System.err.println("MANGO");
            case "Banana":
                System.err.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
    }
}
