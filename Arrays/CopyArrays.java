package Arrays;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        //In Java, we can copy one array into another.
        //There are several techniques you can use to copy arrays in Java.

        //1. Copying Arrays using assignment operator (Shallow Copying Technique)
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] newArray = array;
        System.out.println();
        System.out.println("The elements of newArray");
        for(int a : newArray) {
            System.out.println(a);
        }
        //Downside to this technique is that if one element of array changes,the other element also changes
        //It's because both arrays refer to the same array object.
        newArray[0]=100;
        System.out.println();
        System.out.println("The elements of array\nWe have modified elements of newArray.");
        System.out.println("See how this modification effects (Original array)");
        System.out.println();
        for( int k:array ) {
            System.out.println(k);
        }


        //We need deep copying of arrays.
        //2.Using loops to copy arrays.
        int[] x1 = {1,2,3,4,5};
        int[] x2 = new int[10]; //x2 memory should be allocated before copying elements into the array
        for(int i=0;i<x1.length;i++){
            x2[i]=x1[i]; //five elements have copied.The rest five elements will be initialized to zero
        }
        System.out.println();
        System.out.println(Arrays.toString(x2));
        //Here, the source and destination array refer to different objects (deep copy).
        // Hence, if elements of one array are changed, corresponding elements of another array is unchanged.

        //3.Copying arrays using arraycopy() method.
        //In Java, the System class contains a method named arraycopy() to copy arrays.
        // This method is a better approach to copy arrays than the above two.
        //The arraycopy() method allows you to copy a specified portion of the source array to the destination array.

        //SYNTAX:
        //arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        //src - source array you want to copy
        //srcPos - starting position (index) in the source array
        //dest - destination array where elements will be copied from the source
        //destPos - starting position (index) in the destination array
        //length - number of elements to copy

        char[] x3 = {'a','b','c'};
        char[] x4 = new char[x3.length];
        char[] x5 = new char[2];
        System.arraycopy(x3,0,x4,0,x3.length);
        System.arraycopy(x3,1,x5,0,2);
        System.out.println("Elements of x4: "+Arrays.toString(x4));
        System.out.println("Elements of x5: "+Arrays.toString(x5));
        System.out.println();

        //4.Copying arrays using copyOfRange() method defined in java Arrays class
        int[] source = {2, 3, 12, 4, 12, -2};
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length); //copying entire source array to destination
        System.out.println("destination1 = " + Arrays.toString(destination1));
        int[] destination2 = Arrays.copyOfRange(source, 2, 5); //copying from index 2 to 5 (5 is not included)
        System.out.println("destination2 = " + Arrays.toString(destination2));
        //we are creating the destination1 array and copying the source array to it at the same time.
        // We are not creating the destination1 array before calling the copyOfRange() method.










    }
}
