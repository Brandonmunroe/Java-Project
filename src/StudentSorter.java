import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSorter {

    // ============================
    // Student Class
    // ============================

    // Data Member (Instance Variable)
    // Stores the student's name
    private static class Student {
        private String name;

        // Constructor
        // Initializes the Student object with a name
        public Student(String name) {
            this.name = name;
        }

        // Getter Method
        // Returns the student's name
        public String getName() {
            return name;
        }

        // toString Method
        // Allows printing the Student object directly
        @Override
        public String toString() {
            return name;
        }
    }

    // ============================
    // Main Method
    // ============================

    public static void main(String[] args) {

        // Step 1: Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Step 2: Add students to the list
        students.add(new Student("James"));
        students.add(new Student("Chris"));
        students.add(new Student("Alonzo"));
        students.add(new Student("Sara"));
        students.add(new Student("Ben"));
        students.add(new Student("John"));
        students.add(new Student("Tom"));

        // ---------------------------------------
        // Part (a): Sort Alphabetically
        // ---------------------------------------

        // Using Lambda Expression to compare names alphabetically
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println("Sorted Alphabetically:");
        for (Student s : students) {
            System.out.println(s);
        }

        // ---------------------------------------
        // Part (b): Sort by Length of Name
        // ---------------------------------------

        // Using Lambda Expression to compare name lengths
        Collections.sort(students, (s1, s2) -> s1.getName().length() - s2.getName().length());

        System.out.println("\nSorted by Length of Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}