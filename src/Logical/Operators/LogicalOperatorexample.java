package Logical.Operators;
import java.util.Scanner;

public class LogicalOperatorexample {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Please enter the attendance percentage. " );
      int attendance = input.nextInt();

      System.out.println("Is the student currently suspended? " );
      boolean suspended = input.nextBoolean();

      if (attendance <= 75 && suspended) {
          System.out.println("The student is NOT eligible to write the exam");

      } else {
          System.out.println("The student is eligible to write the exam.");

      }
      input.close();



    }

}
