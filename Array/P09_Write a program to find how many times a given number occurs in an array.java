import java.util.Scanner;

class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to count: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        System.out.println(num + " occurs " + count + " times in the array.");

        sc.close();
    }
}


Enter the number of elements: 6
Enter 6 integers:
10
20
10
30
10
40
Enter the number to count: 10
10 occurs 3 times in the array.
