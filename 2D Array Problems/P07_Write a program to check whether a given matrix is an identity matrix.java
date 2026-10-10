import java.util.Scanner;

class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        boolean isIdentity = true;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (rows != cols) {
            isIdentity = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == j && matrix[i][j] != 1) {
                        isIdentity = false;
                    } else if (i != j && matrix[i][j] != 0) {
                        isIdentity = false;
                    }
                }
            }
        }

        if (isIdentity) {
            System.out.println("The matrix is an Identity Matrix.");
        } else {
            System.out.println("The matrix is not an Identity Matrix.");
        }

        sc.close();
    }
}



Enter number of rows: 3
Enter number of columns: 3
Enter matrix elements:
1 0 0
0 1 0
0 0 1
