package Assignment;

public class MergeSortExample {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;


        mergeSort(arr, left, mid);


        mergeSort(arr, mid + 1, right);


        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;


        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }


        while (i <= mid) {
            temp[k++] = arr[i++];
        }


        while (j <= right) {
            temp[k++] = arr[j++];
        }


        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4, 6, 1, 3};
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println(java.util.Arrays.toString(arr1));
        // Output: [1, 2, 3, 4, 5, 6]

        int[] arr2 = {3, 3, 2, 1};
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println(java.util.Arrays.toString(arr2));
        // Output: [1, 2, 3, 3]
    }
}