package Java_Basic_Concepts;

public class Other_Operators {
    public static void main(String[] args) {

        //Java instanceof Operator
        //The instanceof operator checks whether an object is an instanceof a particular class.
        String str = "Muskula Rahul";
        boolean result;
        result = str instanceof String;  //// checks if str is an instance of the String class
        System.out.println("Is str an object of String? " + result);
        System.out.println();

        //Java Ternary Operator
        //The ternary operator (conditional operator) is shorthand for the if-then-else statement.
        //variable = Expression ? expression1 : expression2
        //Here's how it works.
        //If the Expression is true, expression1 is assigned to the variable.
        //If the Expression is false, expression2 is assigned to the variable.
        int assignedNumber=100;
        String Value;
        Value = (assignedNumber == 28) ? "You Got It:)" : "That's Not It:(";
        System.out.println(Value);

    }
}
