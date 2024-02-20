
package lesson8.Assignment.Assg8; // Package declaration for the lesson8.Assignment.Assg8 package

public class PaymentException extends Exception { // Definition of a custom exception class extending Exception

    public PaymentException() { // Constructor without parameters
        super(); // Call to the superclass constructor (Exception)
    }

    public PaymentException(String message) { // Constructor with a message parameter
        super(message); // Call to the superclass constructor (Exception) with a message
    }

    public PaymentException(String message, Throwable cause) { // Constructor with message and cause parameters
        super(message, cause); // Call to the superclass constructor (Exception) with a message and cause
    }

    public PaymentException(Throwable cause) { // Constructor with cause parameter
        super(cause); // Call to the superclass constructor (Exception) with a cause
    }
}
