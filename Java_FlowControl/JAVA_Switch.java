package Java_FlowControl;

public class JAVA_Switch {
    public static void main(String[] args) {
        //The switch statement allows us to execute a block of code among many alternatives.
        // The working of the switch-case statement is similar to the Java if...else...if ladder.
        // However, the syntax of the switch statement is cleaner and much easier to read and write.
        int number = 10;
        String Number;
        // switch statement to check Number
        switch (number) {
            case 10:
                Number = "Number 10";
                break;
        //The break statement is used to terminate the switch-case statement.
        // If break is not used, all the cases after the matching case are also executed.
            case 20:
                Number = "Number 20";
                break;
            case 30:
                Number = "Number 30";
                break;
            default: //Optional.Executes Default Case.
                Number = "Unknown";
                break;

        }
        System.out.println("You Have Chosen " + Number + ".");
        //The Java switch statement only works with:
        //Primitive data types: byte, short, char, and int
        //Enumerated types
        //String Class
        //Wrapper Classes: Character, Byte, Short, and Integer.





    }
}
