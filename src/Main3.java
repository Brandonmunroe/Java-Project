import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static List<Integer> mergeSorted(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;



        while (i < a.size() && j < b.size()) {

            if (a.get(i) <= b.get(j)) {

                result.add(a.get(i++));

            } else {

                result.add(b.get(j++));

            }

        }



        while (i < a.size()) result.add(a.get(i++));

        while (j < b.size()) result.add(b.get(j++));



        return result;

    }



    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 3, 5);

        List<Integer> b = Arrays.asList(2, 4, 6);

        System.out.println(mergeSorted(a, b));

    }

}