package Arrays;

public class multiDimensionalArrays {
    public static void main(String[] args) {

        //A multidimensional array is an array of arrays.
        //Each element of a multidimensional array is an array itself.

        int[][] x = new int[3][4];
        //Here, we have created a multidimensional array named x.
        //It is a 2-dimensional array, that can hold a maximum of 12 elements.
        //x is like a matrix that has three rows and four columns.

        String[][][] Data = new String[3][4][2];
        //Data is 3d array that has max number of elements 24. (3*4*2)

        //Initialize a 2d array in java.
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        //As we can see, each element of the multidimensional array is an array itself.
        //And also, unlike C/C++, each row of the multidimensional array in Java can be of different lengths.
    }
}
