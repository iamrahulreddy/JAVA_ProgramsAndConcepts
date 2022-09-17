package Java_FlowControl;

public class If_else {
    public static void main(String[] args) {

        boolean condition=true;

        //The syntax of an if statement is
         if (condition) {
             //statements ; Here the condition is a boolean expression
        }
        //The if statement executes a certain section of code if the test expression is evaluated to true.
        // However, if the test expression is evaluated to false, it does nothing.

        //The syntax of if-else syntax is
        if (condition) {
         // codes in if block
        }
        else {
        // codes in else block
        }

        //Java if...else...if Statement
        //In Java, we have an if...else...if ladder, that can be used to execute one block of code among multiple other blocks.
        if (condition) {
          // codes
        }
        else if(condition) {
        //  codes
        }
        else if (condition) {
        // codes
        }
        else {
        // codes
        }

        // similarly nested if's and if-else statements
    }
}
