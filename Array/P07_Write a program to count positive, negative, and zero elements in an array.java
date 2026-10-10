import java.util.Scanner;

class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive numbers count: " + positive);
        System.out.println("Negative numbers count: " + negative);
        System.out.println("Zero count: " + zero);

        sc.close();
    }
}



Enter the number of elements: 6
Enter 6 integers:
10
-5
0
20
-8
0
Positive numbers count: 2
Negative numbers count: 2
Zero count: 2
