package ObjectOrientedProgramming;

public class Method_Overloading {
    public static void main(String[] args) {
        //In Java, two or more methods may have the same name if they differ in parameters (different number of parameters, different types of parameters, or both).
        //These methods are called overloaded methods and this feature is called method overloading.
        //method overloading is not associated with return types.
        //Overloaded methods may have the same or different return types, but they must differ in parameters.

        //Method overloading is achieved by either:
        //changing the number of arguments.
        //or changing the data type of arguments.
        //It is not method overloading if we only change the return type of methods.
        //There must be differences in the number of parameters.
        //In Java, we can also overload constructors in a similar way like methods.

        Overloading_Demo object = new Overloading_Demo();
        object.name("sunny");
        object.name("rahul","reddy");
        object.name("muskula","rahul","reddy");
    }
}

class Overloading_Demo {
    public void name(String x) {
        System.out.println();
        System.out.println("Your sweet name is : "+x);
    }

    public void name(String x1,String x2) {
        System.out.println();
        System.out.println("Your Official Name : "+x1+x2);
    }

    public void name(String x1,String x2,String x3) {
        System.out.println();
        System.out.println("Your full name : "+x1+x2+x3);
    }
}
