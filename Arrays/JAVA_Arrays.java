package Arrays;

public class JAVA_Arrays {
    public static void main(String[] args) {
        //An array is a collection of similar types of data.
        String[] array = new String[100];
        //In above syntax declaration of array and memory allocation is done in one statement.
        //Here, the above array cannot store more than 100 names.
        // The number of values in a Java array is always fixed.

        //Declaration of array SYNTAX:
        //dataType[] arrayName; Array Declaration
        //new dataType[x] x-> To allocate the memory for array in java
        //dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
        //arrayName - it is an identifier
        //To define the number of elements that an array can hold, we have to allocate memory for the array in Java.


        //declare and initialize and array
        //int[] age = {12, 4, 5, 2, 5};
        //. In this case, the Java compiler automatically specifies the size by counting the number of elements in the array (i.e. 5).


        //In the Java array, each memory location is associated with a number.
        //The number is known as an array index.
        //We can also initialize arrays in Java, using the index number
        // declare an array . For Example:
        int[] age = new int[3];
        age[0] = 12;
        age[1] = 4;
        age[2] = 5;

        //Array indices always starts from zero.
        //We can access the element of an array using the index number.

        //Accessing all elements at once using for loop.
        String[] names = new String[3];
        names[0] = "Muskula";
        names[1] = "Rahul";
        names[2] = "Reddy";
        for (int i = 0; i < names.length; i++) {
            System.out.println((i+1) + " Element is: "+names[i]);
        }
        System.out.println();

        //Accessing elements at once using for-each loop
        for(String x : names) {
            System.out.println("Name: "+x);
        }

    }
}
