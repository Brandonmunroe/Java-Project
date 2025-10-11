package Logical.Operators;
import java.util.Scanner;

public class MembershipDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a member? ");
        boolean member = input.nextBoolean();

        System.out.println("Enter your total amount of purchases: ");
        double amount = input.nextDouble();

        boolean discount = (member && amount >= 100);

        System.out.println("Customer is eligible for discount: " + discount);

        if (amount >= 100 && member) {
            System.out.println("You qualify for a discount! ");

        } else {
            System.out.println("You do NOT qualify for a discount :( ");

        }
    }

}
