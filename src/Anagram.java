import java.util.Arrays;

public class Anagram {
    public static boolean validAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        char[] a = s.toLowerCase().toCharArray();
        char[] b = t.toLowerCase().toCharArray();
        Arrays.sort(a); Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(validAnagram("listen", "silent"));
        System.out.println(validAnagram("Triangle", "Integral"));
        System.out.println(validAnagram("apple", "pale"));
    }
}