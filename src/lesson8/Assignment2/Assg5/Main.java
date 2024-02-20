package lesson8.Assignment2.Assg5;

public class Main {
    public static void main(String[] args) {
        // Example usage of Matrix class
        Matrix<Integer> matrix1 = new Matrix<>(2, 3);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(0, 2, 3);
        matrix1.setElement(1, 0, 4);
        matrix1.setElement(1, 1, 5);
        matrix1.setElement(1, 2, 6);

        Matrix<Integer> matrix2 = new Matrix<>(3, 2);
        matrix2.setElement(0, 0, 7);
        matrix2.setElement(0, 1, 8);
        matrix2.setElement(1, 0, 9);
        matrix2.setElement(1, 1, 10);
        matrix2.setElement(2, 0, 11);
        matrix2.setElement(2, 1, 12);

        // Transpose matrix1
        matrix1.transpose();
        System.out.println("Transposed matrix1:");
        printMatrix(matrix1);

        // Add matrix1 and matrix2
        Matrix<Integer> sum = matrix1.add(matrix2);
        System.out.println("Sum of matrix1 and matrix2:");
        printMatrix(sum);

        // Multiply matrix1 and matrix2
        Matrix<Integer> product = matrix1.multiply(matrix2);
        System.out.println("Product of matrix1 and matrix2:");
        printMatrix(product);
    }

    private static <T> void printMatrix(Matrix<T> matrix) {
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                System.out.print(matrix.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }
}
