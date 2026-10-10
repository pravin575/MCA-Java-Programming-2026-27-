import java.util.Scanner;

class MatrixDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 matrix elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Main diagonal elements:");

        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
        sc.close();
    }
}'



1 2 3
4 5 6
7 8 9


  Matrix:
1 2 3
4 5 6
7 8 9
Main diagonal elements:
1 5 9
