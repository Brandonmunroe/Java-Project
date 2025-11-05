import java.util.Scanner;

public class num
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("Please Enter a number");

        int number = input.nextInt();



        if(number > 0){

            System.out.println("Number is positive.");

        } else if (number < 0){

            System.out.println("Number is negative.");

        } else {

            System.out.println("Zero.");

        }
    }
}

