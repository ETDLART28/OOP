import java.util.Scanner;

public class transposeArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking input for rows and columns
        System.out.print("Kitne rows hona: ");
        int rows = in.nextInt();
        System.out.print("Kitne columns hona: ");
        int cols = in.nextInt();

        int[][] arr = new int[rows][cols];

        // Taking input for matrix elements
        System.out.println("Elements daalo bhai:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // Printing the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(arr);

        // Creating the transposed matrix
        int[][] changeArr = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                changeArr[j][i] = arr[i][j]; // Transposing elements
            }
        }

        // Printing the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(changeArr);

        in.close(); //  To Close scanner 
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
