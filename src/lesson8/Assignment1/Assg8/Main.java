package lesson8.Assignment.Assg8; // Package declaration for the lesson8.Assignment.Assg8 package

public class Main {

    public static void main(String[] args) {
        PaymentGateway paymentGateway; // Declaration of a variable of type PaymentGateway

        try {
            // Test PayPal
            paymentGateway = new PayPal(); // Creating a new instance of PayPal
            processPayment(paymentGateway, 100.00); // Invoking the processPayment method with PayPal gateway and 100.00
                                                    // amount

            // Test Stripe
            paymentGateway = new Stripe(); // Creating a new instance of Stripe
            processPayment(paymentGateway, 50.00); // Invoking the processPayment method with Stripe gateway and 50.00
                                                   // amount
        } catch (PaymentException e) { // Catching PaymentException
            System.err.println("Error processing payment: " + e.getMessage()); // Printing error message if
                                                                               // PaymentException is caught
        }
    }

    private static void processPayment(PaymentGateway gateway, double amount) throws PaymentException {
        gateway.processPayment(amount); // Processing payment with the given gateway and amount
        if (gateway.isPaymentSuccessful()) { // Checking if payment was successful
            System.out.println("Payment successful using " + gateway.getName()); // Printing success message
        } else {
            System.out.println("Payment failed using " + gateway.getName()); // Printing failure message
        }
    }
}
