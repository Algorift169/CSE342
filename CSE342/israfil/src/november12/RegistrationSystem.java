package november12;

/*
Create a registration system using two user-defined exceptions: InvalidAgeException:
thrown if a student&#39;s age is below 18. InvalidCGPAException: thrown if a student&#39;s
CGPA is below 2.50 or above 4.00. Create a method registerStudent() that validates
both conditions. If both are valid, display &quot;Registration Successful.&quot; Test with age 20 and
CGPA 2.30.
 */
public class RegistrationSystem {
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    static class InvalidCGPAException extends Exception {
        public InvalidCGPAException(String message) {
            super(message);
        }
    }

    public static void registerStudent(int age, double cgpa) throws InvalidAgeException, InvalidCGPAException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
        if (cgpa < 2.50 || cgpa > 4.00) {
            throw new InvalidCGPAException("CGPA must be between 2.50 and 4.00.");
        }

        System.out.println("Registration Successful.");
        
    }

    public static void main(String[] args) {
        try {
            registerStudent(20, 2.30);
        } catch (InvalidAgeException | InvalidCGPAException e) {
            System.out.println(e.getMessage());
        }
    }
}



