import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static int kthLargest(List<Integer> list, int k) {
        Collections.sort(list, Collections.reverseOrder());
        return list.get(k-1);

    }
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(3, 2, 1, 5, 6, 4);
        System.out.println(kthLargest(list1, 2));
        List<Integer> list2 = Arrays.asList(7, 10, 4, 3, 20, 15);
        System.out.println(kthLargest(list2, 3));

    }
}
