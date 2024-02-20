package lesson8.Assignment.Assg8;

public interface PaymentGateway {

    /**
     * Processes a payment for the specified amount.
     *
     * @param amount The amount to be charged.
     * @throws PaymentException If an error occurs during processing.
     */
    void processPayment(double amount) throws PaymentException;
    // This method is responsible for processing a payment with a specified amount.

    /**
     * Checks if the last payment attempt was successful.
     *
     * @return True if the payment was successful, false otherwise.
     */
    boolean isPaymentSuccessful();
    // This method checks whether the payment was successful or not.

    /**
     * Returns the name of the payment gateway.
     *
     * @return The gateway's name.
     */
    String getName();
}
