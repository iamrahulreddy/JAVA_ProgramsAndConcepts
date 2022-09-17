package Java_Basic_Concepts;

public class JAVA_Exp_Stat_Blocks {
    public static void main(String[] args) {
        //JAVA Expressions
        //A Java expression consists of variables, operators, literals, and method calls.
        //If num1>num2... This is an expression that returns boolean value
        //"rahul reddy" This is a string expression.
        Double a = 2.2, b = 3.4, result;
        result = a + b - 3.4; //Expression
        System.out.println(result);
        System.out.println();

        //JAVA Statements
        //In Java, each statement is a complete unit of execution.
        int score = 9*5;
        //Here, we have a statement.
        // The complete execution of this statement involves multiplying integers 9 and 5;
        // And then assigning the result to the variable score.
        //In the above statement, we have an expression 9 * 5. In Java, expressions are part of statements.

        //We can convert an expression into a statement by terminating the expression with a ;
        //These are known as expression statements
        //num=10 expression
        //num=10; statement

        //Declaration Statements
        //In Java, declaration statements are used for declaring variables.
        Double number = Double.valueOf(25);

        //Java Blocks
        //A block is a group of statements (zero or more) that is enclosed in curly braces { }.
        //A block may not have any statements.

    }
}
