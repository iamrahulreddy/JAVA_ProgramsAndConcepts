package Arrays;

public class multiDimensional_iterating {
    public static void main(String[] args) {
        int[][] x = {{1,2},{3,4,5},{6,7,8}};
        //Iterating through all elements of array.
        //Using for loop
        for (int i = 0; i < x.length; i++) {
            System.out.println();
            System.out.println("Index of array: " + (i));
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j]);
            }
        }
        System.out.println("-----------------------------------------");

        //Iterating through elements of array with for-each loop
        for(int[] a : x) {
            System.out.println();
            for(int b : a) {
                System.out.println(b);
            }
        }

    }
}


