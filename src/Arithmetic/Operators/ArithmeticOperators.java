package Arithmetic.Operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int result = a + b;
        int result1 = a - b;
        int result2 = a * b;
        int result3 = a / b;
        int result4 = a % b;
        System.out.println("Addition:" + result);
        System.out.println("Subtraction:" + result1);
        System.out.println("Multiplication:" + result2);
        System.out.println("Division:" + result3);
        System.out.println("Modular:" + result4);
        //double
        double x = 7.5;
        double y = 2.5;
        double sum = x + y;
        double difference = x - y;
        double product = x * y;
        double quotient = x / y;
        double modular = x % y;
        System.out.println("Addition:" + sum);
        System.out.println("Subtraction:" + difference);
        System.out.println("Multiplication:" + product);
        System.out.println("Division:" + quotient);
        System.out.println("Modular:" + modular);
        //Scores
        int score1 = 50;
        int score2 = 80;
        int score3 = 70;
        int score4 = 90;
        int total = score1 + score2 + score3 +score4;
        double average = total / 4.0;
        System.out.println("Total: " + total);
        System.out.println("average: " + average);
        //Creating  a scanner object
        //Scanner input = new Scanner(System.in);
        //System.out.println("What is your first name?");
      //  for (int i = 1; i <= 5; i++) {
           // String name = input.nextLine();
           // System.out.println(name);


       // }
        Scanner input1 = new Scanner(System.in);
        System.out.println("What is your age? ");
        for (int i = 1; i <= 5; i++) {
            int age = input1.nextInt();
            System.out.println(age);
        }



    }
}
