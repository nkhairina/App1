package lesson8.Assignment.Assg8;

public abstract class BasePaymentGateway implements PaymentGateway { // Definition of an abstract class implementing
                                                                     // PaymentGateway

    private final String name; // Declaring a final variable to store the name of the payment gateway
    private boolean paymentSuccessful = false; // Declaring and initializing a variable to track payment success state

    protected BasePaymentGateway(String name) { // Constructor to initialize the name of the payment gateway
        this.name = name;
    }

    @Override
    public void processPayment(double amount) throws PaymentException { // Implementation of the processPayment method
                                                                        // defined in PaymentGateway interface
        try {
            // Common processing steps (if applicable)
            connectToGateway(); // Call to an abstract method to connect to the payment gateway
            sendPaymentInformation(amount); // Call to an abstract method to send payment information
            if (validatePayment()) { // Checking if payment is valid
                markPaymentSuccessful(); // Marking payment as successful
            } else {
                throw new PaymentException("Payment validation failed."); // Throwing PaymentException if payment
                                                                          // validation fails
            }
        } finally {
            paymentSuccessful = false; // Resetting payment state after the attempt
        }
    }

    protected abstract void connectToGateway() throws PaymentException; // Abstract method declaration to connect to the
                                                                        // payment gateway

    protected abstract void sendPaymentInformation(double amount) throws PaymentException; // Abstract method
                                                                                           // declaration to send
                                                                                           // payment information

    protected abstract boolean validatePayment() throws PaymentException; // Abstract method declaration to validate
                                                                          // payment

    private void markPaymentSuccessful() { // Method to mark payment as successful
        paymentSuccessful = true; // Setting paymentSuccessful to true
    }
}
