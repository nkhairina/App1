package lesson8.Assignment.Assg8;

public class PayPal extends BasePaymentGateway { // Definition of a class PayPal extending BasePaymentGateway

    public PayPal() { // Constructor for PayPal class
        super("PayPal"); // Call to the superclass constructor (BasePaymentGateway) with "PayPal" as the
                         // name
    }

     

                                                                // 
    @Override
    protected void connectToGateway() throws PaymentException { // Implementation of the connectToGateway method defined in BasePaymentGateway
        // Implement PayPal-specific connection logic (using SDK or API)
        // ... (Placeholder for implementation details)
    }

                                                                                   // 
                                                                                   // 
    @Override
    protected void sendPaymentInformation(double amount) throws PaymentException { // Implementation of the sendPaymentInformation method defined in BasePaymentGateway
        // Implement sending payment details to PayPal (using SDK or API)
        // ... (Placeholder for implementation details)
    }

                                                                  // 
    @Override
    protected boolean validatePayment() throws PaymentException { // Implementation of the validatePayment method defined in BasePaymentGateway
        // Implement using PayPal API to validate payment
        // ... (Placeholder for implementation details)
 
    @Override
    public boolean isPaymentSuccessful() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPaymentSuccessful'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public boolean isPaymentSuccessful() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPaymentSuccessful'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public boolean isPaymentSuccessful() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPaymentSuccessful'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}


