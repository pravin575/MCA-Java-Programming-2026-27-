import java.util.Scanner;

class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean alreadyDisplayed = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyDisplayed = true;
                    break;
                }
            }

            if (alreadyDisplayed) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}


Enter the number of elements: 7
Enter 7 integers:
10
20
10
30
20
40
30
Duplicate elements are:
10 20 30
