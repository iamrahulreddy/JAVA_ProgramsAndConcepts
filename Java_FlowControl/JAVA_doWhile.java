package Java_FlowControl;
import java.util.Scanner;

public class JAVA_doWhile {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        // create an object of Scanner class
        Scanner input = new Scanner(System.in);
        // do...while loop continues until entered number is negative
        //The do...while loop is similar to while loop.
        // However, the body of do...while loop is executed once before the test expression is checked.
        do {
            // adds only positive numbers
            sum += number;
            System.out.println("Enter a positive number");
            number = input.nextInt();
        } while(number >= 0);
        System.out.println("Sum = " + sum);
        input.close();
    }
}
