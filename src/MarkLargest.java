import java.util.Scanner;

public class MarkLargest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many integers will you enter? ");
        int count = input.nextInt();

        int[] numbers = new int[count];

        // Read the numbers
        for (int i = 0; i < count; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Find the largest value
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print numbers and mark the largest
        System.out.println("You entered:");
        for (int num : numbers) {
            if (num == max) {
                System.out.println(num + " <-- largest");
            } else {
                System.out.println(num);
            }
        }

        input.close();
    }
}
