import java.util.Arrays;

public class Main {
    public static void sortStudents(Object[][] students) {
        Arrays.sort(students,
                (a, b) -> ((Integer) a[1]) - ((Integer) b[1]));

    }
    public static void main(String[] args) {

        Object[][] students = {

                {"Alice", 85},

                {"Bob", 92},

                {"Charlie", 78}

        };
        sortStudents(students);
        for (Object[] s : students) {

            System.out.println(s[0] + " " + s[1]);

        }

    }
}

