import java.util.Scanner;

class MaximumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int maxDifference = arr[1] - arr[0];

        for (int i = 1; i < n; i++) {
            int difference = arr[i] - min;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum difference: " + maxDifference);

        sc.close();
    }
}



Enter the number of elements: 6
Enter 6 integers:
7
1
5
3
6
4
Maximum difference: 5
