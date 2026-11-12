package november12;
/*Create a custom exception named InvalidMarksException. Write a program that accepts
a student&#39;s marks and checks whether they are between 0 and 100. If the marks are
outside this range, throw the custom exception. Otherwise, display the marks and result
(Pass for marks of 40 or above).
 */
import java.util.Scanner;

public class MarksValidation {
    static class InvalidMarksException extends Exception{
        public InvalidMarksException(String messege){
            super(messege);
        }
    }
    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks Must be between 0 & 100.");
        }
        System.out.println("Marks: "+marks);

        if (marks >= 40) {
            System.out.println("Result: pass");
        }else{
            System.out.println("Result: fail");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Strudent's Marks: ");
        int marks = input.nextInt();

        try {
            validateMarks(marks);
        }catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
    //input.close();
}
