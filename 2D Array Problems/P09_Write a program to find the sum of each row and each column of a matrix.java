import java.util.Scanner;

class MatrixRowColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;

            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;

            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }

        sc.close();
    }
}




Enter number of rows: 2
Enter number of columns: 3
Enter matrix elements:
1 2 3
4 5 6



  Sum of row 1: 6
Sum of row 2: 15
Sum of column 1: 5
Sum of column 2: 7
Sum of column 3: 9
