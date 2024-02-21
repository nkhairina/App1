package quiz.quiz3;

public class question20 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 }; // Line n1
        int sum = 0; // Line n2

        for (int i = 0; i < arr.length; i++) { // Line n3
            sum += arr[i]; // Line n4
        }

        System.out.println("The sum of the elements in the array is: " + sum); // Line n5
    }
}
