package Arrays;

public class threeDimensionalArrays {
    public static void main(String[] args) {
        //Basically, a 3d array is an array of 2d arrays.
        //The rows of a 3d array can also vary in length just like in a 2d array.
        int[][][] test = {
                {
                        {0, 1, 2},
                        {3, 4, 5}
                },
                {
                        {6, 7, 8, 9},
                        {10},
                        {11, 12}
                }
        };
        // for each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}
