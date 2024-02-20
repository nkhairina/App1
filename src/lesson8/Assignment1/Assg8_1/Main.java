package lesson8.Assignment.Assg8_1;

public class Main {

    public static void main(String[] args) {
        PaymentGateway gateway = new PayPal("your_username", "your_password");

        try {
            gateway.processPayment(100.00);
            if (gateway.isPaymentSuccessful()) {
                System.out.println("Payment successful!");
            } else {
                System.out.println("Payment failed: " + gateway.getErrorMessage());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
