package lesson8.Assignment2.Assg5;

public class Matrix<T> {
    private T[][] matrix;
    int rows;
    int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = (T[][]) new Object[rows][cols];
    }

    public void setElement(int i, int j, T value) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        matrix[i][j] = value;
    }

    public T getElement(int i, int j) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return matrix[i][j];
    }

    public void transpose() {
        Matrix<T> transposed = new Matrix<>(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed.setElement(j, i, matrix[i][j]);
            }
        }
        this.matrix = transposed.matrix;
        this.rows = transposed.rows;
        this.cols = transposed.cols;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        Matrix<T> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Assuming the type T supports addition
                result.setElement(i, j, addElements(matrix[i][j], other.getElement(i, j)));
            }
        }
        return result;
    }

    private T addElements(T a, T b) {
        // Implementation specific to the type T
        // You may need to implement this method differently for different types
        // For example, for numeric types like Integer or Double, you can use arithmetic
        // addition
        // For other types, you may need to define how addition should be performed
        return a;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException(
                    "Number of columns in the first matrix must be equal to the number of rows in the second matrix");
        }

        Matrix<T> result = new Matrix<>(rows, other.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < cols; k++) {
                    // Assuming the type T supports multiplication
                    result.setElement(i, j, multiplyElements(matrix[i][k], other.getElement(k, j)));
                }
            }
        }
        return result;
    }

    private T multiplyElements(T a, T b) {
        // Implementation specific to the type T
        // Similar to addElements, you need to define how multiplication should be
        // performed for type T
        return a;
    }

    // Other methods like scalar multiplication, determinant calculation, etc., can
    // be added here
}
