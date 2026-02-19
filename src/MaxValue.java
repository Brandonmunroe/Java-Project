public class MaxValue {

    // Method that returns the maximum value in the array
    public static int max(int[] numbers) {
        int maxValue = numbers[0]; // assume at least one element

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        return maxValue;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        int[] values = {3, 7, 2, 9, 5};
        System.out.println("Maximum value: " + max(values));
    }
}
