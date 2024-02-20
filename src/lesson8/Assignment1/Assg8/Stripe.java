package lesson8.Assignment1.Assg8;

public class Stripe extends BasePaymentGateway { // Definition of a class Stripe extending BasePaymentGateway

    public Stripe() { // Constructor for Stripe class
        super("Stripe"); // Call to the superclass constructor (BasePaymentGateway) with "Stripe" as the
                         // name
    }

    @Override
    protected void connectToGateway() throws PaymentException { // Implementation of the connectToGateway method defined
                                                                // in BasePaymentGateway
        // Implement Stripe-specific connection logic (using SDK or API)
        // ... (Placeholder for implementation details)
    }

}
