package day3_4LabAssignment.studentPortal;

public class InvalidCountryException extends Exception {

    public InvalidCountryException() {

        super("Invalid country provided"); // Default error message
    }
    public InvalidCountryException(String message) {

        super(message);
    }
    public InvalidCountryException(String message, Throwable cause) {

        super(message, cause);
    }
    public InvalidCountryException(Throwable cause) {

        super(cause);
    }
}

