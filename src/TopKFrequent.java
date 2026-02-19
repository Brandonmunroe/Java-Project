import java.util.*;

public class TopKFrequent {

    public static ArrayList<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.put(x, freq.getOrDefault(x, 0) + 1);

        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) buckets.add(new ArrayList<>());

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            buckets.get(e.getValue()).add(e.getKey());
        }

        ArrayList<Integer> result = new ArrayList<>(k);
        for (int f = nums.length; f >= 1 && result.size() < k; f--) {
            for (int val : buckets.get(f)) {
                result.add(val);
                if (result.size() == k) break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3}, 2));
        System.out.println(topKFrequent(new int[]{4,4,4,5,5,6,6,6,6}, 1));
        System.out.println(topKFrequent(new int[]{1}, 1));
    }
}