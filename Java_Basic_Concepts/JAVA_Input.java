package Java_Basic_Concepts;

import java.util.Scanner;
//Java provides different ways to get input from the user.

public class JAVA_Input {
    public static void main(String[] args) {
        //Java INPUT
        //Input from user using the object of Scanner class.
        //In order to use the object of Scanner, we need to import java.util.Scanner package.
        //Then, we need to create an object of the Scanner class.
        // We can use the object to take input from the user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        System.out.println("You entered " + number);
        // closing the scanner object
        input.close();

        //In the above example, we have created an object named input of the Scanner class.
        // We then call the nextInt() method of the Scanner class to get an integer input from the user.
        //Similarly, we can use nextLong(), nextFloat(), nextDouble(), and next() methods to get long,
        // float, double, and string input respectively from the user.

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
    }
}
