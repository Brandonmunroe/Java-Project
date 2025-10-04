public class stepstoZero {
    public static int stepstoZero(int n) {
        int steps = 0;
        while (n > 0) {


            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n -= 1;

            }


        }
        return steps;
    }
}

