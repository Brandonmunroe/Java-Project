package Assignment;

public class QuickSelect {

    public static int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        int targetIndex = n - k;   // convert k-th largest → target index in sorted array
        return quickSelect(arr, 0, n - 1, targetIndex);
    }

    private static int quickSelect(int[] arr, int low, int high, int target) {
        if (low == high) {
            return arr[low];
        }

        int pivotIndex = partition(arr, low, high);

        // If pivot is exactly the target index → answer found
        if (pivotIndex == target) {
            return arr[pivotIndex];
        }
        // Search left side
        else if (pivotIndex > target) {
            return quickSelect(arr, low, pivotIndex - 1, target);
        }
        // Search right side
        else {
            return quickSelect(arr, pivotIndex + 1, high, target);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2)); // 5
        System.out.println(findKthLargest(new int[]{7, 10, 4, 3, 20, 15}, 3)); // 10
        System.out.println(findKthLargest(new int[]{-1, -3, 0, 7}, 1)); // 7
    }
}