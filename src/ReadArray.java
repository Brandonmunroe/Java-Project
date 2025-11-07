import java.util.Scanner;
import java.util.Arrays;

public class ReadArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");

        // loop to read numbers from user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }


        System.out.println("You entered: " + Arrays.toString(numbers));

        input.close();
    }
}