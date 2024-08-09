package codetantraTest;
// User-defined exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Class containing the main method
public class ExceptionHandlingDemo {
    // Method that throws CustomException
    static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above");
        } else {
            System.out.println("Age is valid");
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            int age = 15; // Change the age to test different scenarios
            checkAge(age);
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
