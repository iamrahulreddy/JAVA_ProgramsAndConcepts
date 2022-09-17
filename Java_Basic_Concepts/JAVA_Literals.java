package Java_Basic_Concepts;

public class JAVA_Literals {
    public static void main(String[] args) {
        //Literals are data used for representing fixed values. They can be used directly in the code.
        int a = 1;
        float b = 2.5F;
        char c = 'F'; //Here, 1, 2.5, and 'F' are literals.

        //Different Types Of Literals In JAVA

        //1.Boolean Literals
        //In Java, boolean literals are used to initialize boolean data types.
        // They can store two values: true and false.
        boolean flag1=false;
        boolean flag2=true;
        System.out.println(flag1);
        System.out.println(flag2); //true and false are boolean literals
        System.out.println();

        //2.Integer Literals
        //An integer literal is a numeric value(associated with numbers) without any fractional or exponential part.
        //Integer literals are used to initialize variables of integer types like byte, short, int, and long.
        // There are 4 types of integer literals in Java:
        //binary (base 2)
        //decimal (base 10)
        //octal (base 8)
        //hexadecimal (base 16)
        //In Java, binary starts with 0b, octal starts with 0, and hexadecimal starts with 0x.
        int octalNumber = 027; // octal.It is zero not O alphabet
        int decNumber = 34; // decimal
        int hexNumber = 0x2F; // hexadecimal
        int binNumber = 0b10010; // binary
        System.out.println("The binary number is: "+binNumber);
        System.out.println("The decimal number is: "+decNumber);
        System.out.println("The hexadecimal number is: "+hexNumber);
        System.out.println("The octal number is: "+octalNumber);
        System.out.println();

        //3.Floating-point Literals
        //A floating-point literal is a numeric literal that has either a fractional form or an exponential form.
        // The floating-point literals are used to initialize float and double type variables.
        double myDouble = 9.6;
        float myFloat = 9.6F;
        double myDoubleScientific = 5.44558e3; // 5.44585*10^3
        System.out.println(myDouble);  // prints 9.6
        System.out.println(myFloat);    // prints 9.6
        System.out.println(myDoubleScientific);   // prints 5445.58
        System.out.println();

        //4.Character literals
        //Character literals are unicode character enclosed inside single quotes
        char letter = 'x'; //Here, x is the character literal.
        System.out.println("Character literal: "+letter);
        System.out.println();
        //We can also use escape sequences as character literals.
        // For example, \b (backspace), \t (tab), \n (new line).

        //5.String literals
        //A string literal is a sequence of characters enclosed inside double-quotes
        String str1 = "Rahul"; //One strong literal
        String str2 = "Reddy"; //Another string literal
        System.out.println("String Literal One: "+str1);
        System.out.println("Another string literal: "+str2);
        System.out.println();


    }
}
