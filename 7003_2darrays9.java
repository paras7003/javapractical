import java.util.Scanner;

class sumrowcolumn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = s.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int[] rowSum = new int[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSum[i] += matrix[i][j];
            }
        }

        int[] columnSum = new int[columns];
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                columnSum[j] += matrix[i][j];
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSum[i]);
        }

        System.out.println("Sum of each column:");
        for (int j = 0; j < columns; j++) {
            System.out.println("Column " + (j + 1) + ": " + columnSum[j]);
        }

    }
}
