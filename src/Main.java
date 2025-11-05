import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.println("Please Enter your age");

        int age = input.nextInt();



        if(age >= 18){

            System.out.println("You are an adult.");

        } else if (age >= 13 && age <= 17){

            System.out.println("You are a teenager.");

        } else {

            System.out.println("You are a child.");

        }
    }



}
