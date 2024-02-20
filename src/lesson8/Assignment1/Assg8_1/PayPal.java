package lesson8.Assignment11.Assg8_1;

public class PayPal implements PaymentGateway {

    private final String username;
    private final String password;
    private boolean successful = false;
    private String errorMessage = null;

    public PayPal(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive.");
        }

        // Simulate PayPal integration (replace with actual implementation)
        if (Math.random() > 0.8) { // 20% chance of failure
            successful = false;
            errorMessage = "Payment declined due to insufficient funds or other reasons.";
        } else {
            successful = true;
            // Log or report successful transaction
            System.out.println("Payment of $" + amount + " successful via PayPal.");
        }
    }

    @Override
    public boolean isPaymentSuccessful() {
        return successful;
    }

    @Override
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
