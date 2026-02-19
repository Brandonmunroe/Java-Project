//import java.util.*;

//public static ArrayList<ArrayList<Integer>> powerSet(int[] nums) {
 //   ArrayList<ArrayList<Integer>> result = new ArrayList<>();
// generateSubsets(nums, 0, new ArrayList<>(), result);
//return result;
//}

//private static void generateSubsets(int[] nums, int index,
//              ArrayList<Integer> current,
//             ArrayList<ArrayList<Integer>> result) {
                                            //  if (index == nums.length) {
//   result.add(new ArrayList<>(current));  // Add a copy
//    return;
// }

    // Option 1: Don't include nums[index]
// generateSubsets(nums, index + 1, current, result);

    // Option 2: Include nums[index]
// current.add(nums[index]);
//  generateSubsets(nums, index + 1, current, result);

    // Backtrack
// current.remove(current.size() - 1);
//}
