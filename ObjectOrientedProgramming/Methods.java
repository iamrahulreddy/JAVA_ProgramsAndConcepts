package ObjectOrientedProgramming;

public class Methods {
    public static void main(String[] args) {
        //A method is a block of code that performs a specific task.
        //Dividing a complex problem into smaller chunks makes your program easy to understand and reusable.
        //The main advantage of methods is code reusability and more readable,which makes it easier to debug.
        //In Java, there are two types of methods:
        //1. User-defined Methods: We can create our own method based on our requirements.
        //2. Standard Library Methods: These are built-in methods in Java that are available to use.

        //1.User defined method,Syntax (A simple syntax):
        //returnType nameOfMethod() {.....//method body }
        //returnType - It specifies what type of value a method returns.
        //A Java method may or may not return a value to the function call.Depends on returnType specified
        //If the method does not return any value, we use the void keyword as the return type of the method
        //For example if a method has an int return type then it returns an integer value.
        //If the method does not return a value, its return type is void.
        //nameOfMethod - It is an identifier that is used to refer to the particular method in a program.
        //method body - It includes the programming statements that are used to perform some tasks.
        // The method body is enclosed inside the curly braces { }.

        //Complex method declaration's syntax
        /*
            modifier static returnType nameOfMethod (parameter1, parameter2, ...) {
                // method body
          }

        */
        //modifier - It defines access types whether the method is public, private, and so on.
        //static - If we use the static keyword, it can be accessed without creating objects.
        //parameter1/parameter2 - These are values passed to a method.
        //We can pass any number of arguments to a method.

        //To call a non-static method use the instance of class to call the method and pass the param.(If any)
        userDefinedMethodDemo object = new userDefinedMethodDemo();
        String K = object.fullName("Muskula"," Rahul");
        System.out.println("Your full name is : " + K);

        object.square(2.6457513110645907);

        //Method parameters in JAVA
        //A method parameter is a value accepted by the method.
        //Say,the method parameter is of type  int.If we pass any other data type instead of int, the compiler will throw an error.
        // It is because Java is a strongly typed language.
        //returnType methodName(int x) {.... } .
        //Here the x,which is accepted by method definition is known as formal argument
        //methodName(100). Here 100,which is passed during the method call is the actual argument.
        //The type of actual arguments and formal arguments should always match.

        //Standard library methods
        standardLibraryMethods object_1 = new standardLibraryMethods();
        object_1.squareRoot(7);



    }
}

class userDefinedMethodDemo {
    public String fullName(String x1, String x2) {
      return x1+x2;
    }
    public void square(double x) {
        double x_square=x*x;   //Notice there is no return statement. void keyword acts as return statement.
        System.out.println("The "+ x + " Square Value: "+x_square);
    }
}

class standardLibraryMethods {
    //The standard library methods are built-in methods in Java that are readily available for use.
    //These standard libraries come along with the Java Class Library (JCL) in a Java archive (*.jar) file with JVM and JRE.
    //sqrt() is a method of Math class. It returns the square root of a number.
    public void squareRoot(double x ) {
        System.out.println();
        System.out.println("The square root of "+x+"is: "+Math.sqrt(x));
    }
}
