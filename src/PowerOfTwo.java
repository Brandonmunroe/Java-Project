public class PowerOfTwo {
    public static Boolean powerOfTwo(int num) {
        // A power of two must be greater than 0
        // and must have only one bit set in its binary form
        if (num <= 0) {
            return false;
        }
        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(16));  // true
        System.out.println(powerOfTwo(256)); // true
        System.out.println(powerOfTwo(6));   // false
        System.out.println(powerOfTwo(-2));  // false
    }
}
