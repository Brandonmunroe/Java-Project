import java.util.ArrayList;
public class maxLength {

    public static int maxLength(ArrayList<String> list) {
        int max = 0;

        for (int i = 0; i< list.size(); i++) {
        String s = list.get(i);
        if (s.length() > max){
            max = s.length();
        }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Programming");
        words.add("CS");
        words.add("ArrayList");

        System.out.println("Length of longest string: " + maxLength(words));
    }
}
