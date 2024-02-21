package quiz.quiz3;

public class question35 {

    public static boolean isPalindrome(String s) {
        // Handle base cases
        if (s.isEmpty() || s.length() == 1) {
            return true;
        }

        // Convert the string to lowercase and remove non-alphanumeric characters
        String processed = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Use two pointers to compare characters from the beginning and end
        int left = 0;
        int right = processed.length() - 1;

        while (left < right) {
            if (processed.charAt(left) != processed.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testCases = { "A man, a plan, a canal: Panama", "racecar", "hello", "leetcode" };

        for (String testCase : testCases) {
            System.out.println(testCase + " is palindrome: " + isPalindrome(testCase));
        }
    }
}
