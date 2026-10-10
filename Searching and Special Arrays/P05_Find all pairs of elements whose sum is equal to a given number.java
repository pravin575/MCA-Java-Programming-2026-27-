import java.util.Scanner;

class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int sum = sc.nextInt();

        System.out.println("Pairs whose sum is " + sum + ":");

        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found.");
        }

        sc.close();
    }
}



Enter the number of elements: 6
Enter array elements:
2 4 3 5 7 8
Enter the target sum: 10
Pairs whose sum is 10:
2 + 8
3 + 7
