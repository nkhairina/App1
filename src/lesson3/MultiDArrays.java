package lesson3;

public class MultiDArrays {

    public static void main(String[] args) {
        int[][][] a = { { { 1, 2, 3 }, { 4, 5 }, { 6 } }, { { 7, 8 }, { 9 } } };

        System.out.println("a.length = " + a.length); // print the length of Dimension array

        for (int i = 0; i < a.length; i++) { // outer loop iterates D
            System.out.println("a[" + i + "].length = " + a[i].length); // Number of sub-arrays in each dimension [1D]
                                                                        // (3 for dimension 0, 2 for dimension 1).

            for (int j = 0; j < a[i].length; j++) { // // middle loop iterates D
                System.out.println("a[" + i + "][" + j + "].length = " + a[i][j].length); // Number of elements in each
                                                                                          // sub-array [2D],(3, 2, 1 for
                                                                                          // different sub-arrays).

                for (int k = 0; k < a[i][j].length; k++) { // inner loop iterates D
                    System.out.print("a[" + i + "][" + j + "][" + k + "] = " + a[i][j][k] + ", "); // Number of elements
                                                                                                   // in each sub-array
                                                                                                   // [3D],
                }
                System.out.println(); // Newline after each sub-array
            }
            System.out.println(); // Newline after each dimension
        }
    }
}
