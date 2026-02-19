import java.util.Scanner;

public class LogicAndBitwise {

    // Safely read a boolean value
    public static boolean getBoolean(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.next().trim().toLowerCase();

            if (input.equals("true") || input.equals("t") || input.equals("1")) {
                return true;
            } else if (input.equals("false") || input.equals("f") || input.equals("0")) {
                return false;
            } else {
                System.out.println("Error: Please enter True or False.");
            }
        }
    }

    // Logic operations
    public static void logicOperations(Scanner sc) {
        System.out.println("\n--- LOGIC OPERATIONS ---");

        boolean p = getBoolean(sc, "Enter truth value for p (True/False): ");
        boolean q = getBoolean(sc, "Enter truth value for q (True/False): ");

        System.out.println("\nResults:");
        System.out.println("p AND q: " + (p && q));
        System.out.println("p OR q: " + (p || q));
        System.out.println("p XOR q: " + (p ^ q));
        System.out.println("p → q (conditional): " + ((!p) || q));
        System.out.println("p ↔ q (biconditional): " + (p == q));
    }

    // Safely read a bitstring
    public static String getBitString(Scanner sc, String prompt, int n) {
        while (true) {
            System.out.print(prompt);
            String s = sc.next().trim();

            if (s.length() == n && s.matches("[01]+")) {
                return s;
            } else {
                System.out.println("Error: Input must be a " + n + "-bit string of 0s and 1s.");
            }
        }
    }

    // Bitwise operations
    public static void bitwiseOperations(Scanner sc) {
        System.out.println("\n--- BITWISE OPERATIONS ---");

        System.out.print("Enter bitstring length n: ");
        int n;

        try {
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error: n must be an integer.");
            sc.nextLine();
            return;
        }

        String a = getBitString(sc, "Enter first " + n + "-bit string: ", n);
        String b = getBitString(sc, "Enter second " + n + "-bit string: ", n);

        StringBuilder andRes = new StringBuilder();
        StringBuilder orRes = new StringBuilder();
        StringBuilder xorRes = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char bitA = a.charAt(i);
            char bitB = b.charAt(i);

            andRes.append((bitA == '1' && bitB == '1') ? '1' : '0');
            orRes.append((bitA == '1' || bitB == '1') ? '1' : '0');
            xorRes.append((bitA != bitB) ? '1' : '0');
        }

        System.out.println("\nResults:");
        System.out.println("Bitwise AND: " + andRes);
        System.out.println("Bitwise OR : " + orRes);
        System.out.println("Bitwise XOR: " + xorRes);
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Logic operations on propositions");
        System.out.println("2. Bitwise operations on bit strings");
        System.out.print("Enter 1 or 2: ");

        String choice = sc.next();

        if (choice.equals("1")) {
            logicOperations(sc);
        } else if (choice.equals("2")) {
            bitwiseOperations(sc);
        } else {
            System.out.println("Invalid choice. Program exiting.");
        }

        sc.close();
    }
}