package Logical.Operators;

public class Logicaloperatorpractice {
    public static void main(String[] args) {
        // Declare and assign variables
        int ABC = 10;
        int B = 5;
        int C = 8;

        // Declare a result variable
        boolean result;

        // Use logical AND (&&)
        result = (ABC > B) && (C > B);  // true if both conditions are true

        // Control statement (if, else if, else)
        if (result) {
            System.out.println("Both conditions are true!");
        } else if (ABC > C) {
            System.out.println("ABC is greater than C.");
        } else {
            System.out.println("At least one condition is false.");
        }
    }
}
