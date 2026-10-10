import java.util.Scanner;

class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int even = 0, odd = 0;

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);

        sc.close();
    }
}



Enter the number of elements: 6
Enter 6 integers:
10
15
20
25
30
35
Even numbers count: 3
Odd numbers count: 3
