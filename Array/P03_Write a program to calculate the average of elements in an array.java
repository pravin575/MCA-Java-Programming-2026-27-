import java.util.Scanner;

class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        sc.close();
    }
}



Enter the number of elements: 5
Enter 5 integers:
10
20
30
40
50
Sum of elements: 150
Average of elements: 30.0
