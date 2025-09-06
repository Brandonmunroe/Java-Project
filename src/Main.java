//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i < 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        //dataType variableName = value;
        int number = 32;
        System.out.println( number);
        int age = 18;
        System.out.println(age);
        String greeting = "Hello Brandon";
        System.out.println(greeting);
        double price = 10.50;
        System.out.println(price);
        char character = 'H';
        System.out.println(character);
       Boolean isJavaFun = true;
       System.out.println(isJavaFun);
       String firstName = "Kieron";
       System.out.println(firstName);
       int newAge = 21;
       System.out.println(newAge);
       double gpa = 3.8;
       System.out.println(gpa);
       boolean student = true;
       System.out.println( "My name is "+firstName+ ",I am " +newAge+ " years old,my GPA is " +gpa+ ",and I am a student:"+student);
       int favNum = 7;
       System.out.println(favNum);
       double height = 5.9;
       System.out.println(height);
       char gender = 'M';
       System.out.println(gender);
       String nickName = "Bragga";
       System.out.println("Hi, my nickname is " +nickName+ " I am " +newAge+ " years old, my height is "  +height+ "m, and my favorite number is " +favNum);
       //Arithmetic Operator
        //Addition
        int numOne = 20;
        int numTwo = 50;
        int result = numOne + numTwo;
        System.out.println(result);

        int numThree = 25;
        int numFour = 75;
        int resultTwo = numThree + numFour;
        System.out.println(resultTwo);

        String nameTwo = "Brandon";
        int numFive = 36;
        String resultThree = nameTwo + numFive;
        System.out.println(resultThree);

        //Subtraction
        int numSix = 70;
        int numSeven = 36;
        int subResult = numSix - numSeven;
        System.out.println(subResult);

        int numEight = 100;
        int numNine = 58;
        int subResultTwo = numEight - numNine;
        System.out.println(subResultTwo);

        //Multiplication
        int numTen = 10;
        int numEleven = 45;
        int product = numTen * numEleven;
        System.out.println(product);

        //division
        int numTwelve = 8;
        int numThirteen = 4;
        int quotient = numTwelve / numThirteen;
        System.out.println(quotient);

        //modular
        int numFourteen = 8;
        int numFifteen = 4;
        int module = numFourteen % numFifteen;
        System.out.println(module);

        //Student Exercise
        int numSixteen = 200;
        int numSeventeen = 150;
        int resultFour = numSixteen + numSeventeen;
        int subResultThree = numSixteen - numSeventeen;
        int productTwo = numSixteen * numSeventeen;
        int moduleTwo = numSixteen % numSeventeen;
        System.out.println("Sum: " + resultFour);
        System.out.println("Difference: " + subResultThree);
        System.out.println("Product: " + productTwo);
        System.out.println("Remainder: " + moduleTwo);

        //Student eligibility
        String firstName2 = "Kordell";
        System.out.println(firstName2);
        int newAge2 = 25;
        System.out.println(newAge2);
        double gpa2 = 4.0;
        System.out.println(gpa2);
        boolean student2 = true;
        System.out.println( "My name is "+firstName2+ ",I am " +newAge2+ " years old,my GPA is " +gpa2+ ",and I am a student:"+student2);
        float attendance = 80;
        System.out.println(attendance);

        //Relational Operations
        //equal to==
        // not equal to !=
        // Greater than >
        //Less Than <
        // Greater than or equal to >=
        // Less than or equal to <=

        int first = 10;
        int second = 0;
        System.out.println(first == second);
        System.out.println(first != second);
        System.out.println(first < second);
        System.out.println(first > second);
        System.out.println(first <= second);
        System.out.println(first >= second);

        //logical operations
        //AND (both must be true) &&
        //OR (at least one true) ||
        //! NOT (reverses value)
        System.out.println(!(first < second) && first > second);

        int seventh = 7;
        System.out.println(seventh > 0 && seventh < 10);

        int third = 20;
        System.out.println(third < 0 || third > 100);

        int fifth = 5;

        System.out.println(!(fifth == 10));

        //Assignment Operators

        String name = "Kieron";
        System.out.println(name);

        //Destination | Source

        int sum = 0;
        sum += 1;
        System.out.println(sum);

        int minus = 10;
        minus -= 5;
        System.out.println(minus);

        //Control Flow
        //One to many brackets

        int age1 = 19;

        if (age1 >= 18) {
            System.out.println("You are an adult");
        }  else {
                System.out.println("You are a minor");
            }
        }











    }
