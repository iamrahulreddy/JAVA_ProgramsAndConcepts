package Java_Basic_Concepts;

public class JAVA_DataTypes {
    public static void main(String[] args) {
        //Data types specify the type of data that can be stored inside variables in Java.
        //Java is a statically-typed language. This means that all variables must be declared before they can be used.
        //There are 8 data types predefined in Java, known as primitive data types.
        //n addition to primitive data types, there are also referenced types (object type).

        //1.Boolean type
        //The boolean data type has two possible values, either true or false.
        //Default value: false.
        boolean flag=true;

        //2. byte type
        //The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
        //If it's certain that the value of a variable will be within -128 to 127, then it is used instead of int to save memory.
        //Default value: 0.
        byte byteVariable=16;
        System.out.println("Byte Variable: "+byteVariable);
        System.out.println();

        //3.short type
        //The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
        //Default Value:0
        short shortVariable=12000;
        System.out.println("Short Variable: "+shortVariable);
        System.out.println();

        //4. int type
        //The int data type can have values from -2 power 31 to (2 power31)-1
        // (32-bit signed two's complement integer).
        //Default value:0
        int intVariable=100000;
        System.out.println("Int Variable: "+intVariable);
        System.out.println();

        //5. long data type
        //The int data type can have values from -2 power 63 to (2 power 63)-1
        long longVariable = -123546987800000L; //L To represent Long data type
        System.out.println("Long Variable"+longVariable);
        System.out.println();

        //6. double data type
        //The double data type is a double-precision 64-bit floating-point.
        //Default value: 0.0 (0.0d)
        double doubleVariable = -100.0;
        System.out.println("Double variable: "+doubleVariable);
        System.out.println();

        //7. float data type
        //The float data type is a single-precision 32-bit floating-point
        //Default value: 0.0 (0.0f)
        float floatVariable = -100.0f; //Treats this as floating number instead of double
        System.out.println("Float variable: "+floatVariable);
        System.out.println();

        //8. char data type
        //It's a 16-bit Unicode character.
        //The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
        //Default value: '\u0000'
        char letter1 = 65;
        System.out.println(letter1);  // prints A ASCII Value of A Is 65
        System.out.println();

        //Non-primitive datatype
        //ava also provides support for character strings via java.lang.String class.
        // Strings in Java are not primitive types. Instead, they are objects
        String myString = "Muskula Rahul";
    }
}
