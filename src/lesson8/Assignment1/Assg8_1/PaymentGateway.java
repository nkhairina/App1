package lesson8.Assignment1.Assg8_1;

public interface PaymentGateway {

    void processPayment(double amount);

    boolean isPaymentSuccessful();

    void setErrorMessage(String errorMessage);

    String getErrorMessage();

}
