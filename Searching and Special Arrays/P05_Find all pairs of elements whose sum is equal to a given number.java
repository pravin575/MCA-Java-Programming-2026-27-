import java.util.Scanner;

class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        boolean found = false;

        System.out.println("Pairs whose sum equals " + target + ":");

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
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
Enter 6 integers:
2
4
3
5
7
1
Enter the target sum: 6
Pairs whose sum equals 6:
2 + 4 = 6
2 + 4 = 6
5 + 1 = 6
