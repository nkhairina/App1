package quiz.quiz3;

public class question24 { // public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Password must be at least 8 characters long
        if (password.length() < 8) {
            return false;
        }

        // Password must contain at least one lowercase letter
        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break; // Exit the loop after finding a lowercase letter
            }
        }
        if (!hasLowercase) {
            return false;
        }

        // Password must contain at least one uppercase letter
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break; // Exit the loop after finding an uppercase letter
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Password must contain at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break; // Exit the loop after finding a digit
            }
        }
        if (!hasDigit) {
            return false;
        }

        // Password must not contain any special characters other than allowed ones
        String allowedChars = "!@#$%^&*()_+-=[]{};':\"\\|,.<>/?";
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !allowedChars.contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] passwords = { "Password123!", "abcd1234", "abc123Abc", "Password#123", "pw123" };

        for (String password : passwords) {
            System.out.println(password + ": " + isValidPassword(password));
        }
    }
}
