import java.util.ArrayList;

class Lab3 {

    // 1. secondLargest
    public static int secondLargest(ArrayList<Integer> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("List must have at least two elements");
        }

        Integer largest = null;
        Integer second = null;

        for (int num : list) {
            if (largest == null || num > largest) {
                second = largest;
                largest = num;
            } else if (num != largest && (second == null || num > second)) {
                second = num;
            }
        }

        if (second == null) {
            throw new IllegalArgumentException("No distinct second largest element found");
        }
        return second;
    }

    // 2. contains
    public static boolean contains(String[] arr, String target) {
        for (String word : arr) {
            if (word.equals(target)) {
                return true;
            }
        }
        return false;
    }

    // 3. valedictorian
    static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static String valedictorian(Student[] students) {
        if (students.length == 0) {
            throw new IllegalArgumentException("No students provided");
        }

        Student top = students[0];
        for (Student s : students) {
            if (s.grade > top.grade) {
                top = s;
            }
        }
        return top.name;
    }

    // 4. insertAt (Binary Search - O(log n))
    public static int insertAt(ArrayList<Integer> list, int value) {
        int left = 0, right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) < value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // 5. searchMatrix (Binary Search on 2D matrix)
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) return true;
            else if (midValue < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }

    // --- TESTING ---
    public static void main(String[] args) {
        // Test 1: secondLargest
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(5); nums1.add(2); nums1.add(9); nums1.add(1); nums1.add(7);
        System.out.println("Second largest: " + secondLargest(nums1)); // 7

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(10); nums2.add(10); nums2.add(9);
        System.out.println("Second largest: " + secondLargest(nums2)); // 9

        // Test 2: contains
        String[] words = {"apple", "banana", "cherry"};
        System.out.println(contains(words, "banana")); // true
        System.out.println(contains(words, "grape"));  // false

        // Test 3: valedictorian
        Student[] students = {
                new Student("Alice", 89.5),
                new Student("Bob", 92.0),
                new Student("Charlie", 88.0)
        };
        System.out.println("Valedictorian: " + valedictorian(students)); // Bob

        // Test 4: insertAt
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(1); sortedList.add(3); sortedList.add(5); sortedList.add(7);
        System.out.println("Insert index: " + insertAt(sortedList, 4)); // 2

        // Test 5: searchMatrix
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
        System.out.println("Search 9: " + searchMatrix(matrix, 9)); // true
        System.out.println("Search 6: " + searchMatrix(matrix, 6)); // false
    }
}
