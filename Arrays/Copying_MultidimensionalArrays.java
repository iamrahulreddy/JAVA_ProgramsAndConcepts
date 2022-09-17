package Arrays;
import java.util.Arrays;
public class Copying_MultidimensionalArrays {
    public static void main(String[] args) {
        //Similar to the single-dimensional array,
        //we can also copy the 2-dimensional array using the for loop.
        int[][] source = {
                {1, 2, 3, 4},
                {5, 6},
                {0, 2, 42, -4, 5}
        };
        int[][] destination = new int[source.length][];
        for (int i = 0; i < destination.length; ++i) {
            destination[i] = new int[source[i].length];
            //allocating space for each row of destination array
            for (int j = 0; j < destination[i].length; ++j) {
                destination[i][j] = source[i][j];
            }
        }
        //displaying destination array
        System.out.println(Arrays.deepToString(destination));
        //Here,the deepToString() method is used to provide a better representation of the 2-dimensional array.


        /*  NOTE: Copying multidimensional array using arrayCopy() can also be done.
          int[][] source = {
                      {1, 2, 3, 4},
                      {5, 6},
                      {0, 2, 42, -4, 5}
                     };
                int[][] destination = new int[source.length][];
                for (int i = 0; i < source.length; ++i) {
                     // allocating space for each row of destination array
                     destination[i] = new int[source[i].length];
                     System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
                }
               now,let's displaying destination array
               System.out.println(Arrays.deepToString(destination)); */
    }
}
