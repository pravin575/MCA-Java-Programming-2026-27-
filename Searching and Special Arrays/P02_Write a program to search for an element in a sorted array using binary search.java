import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements in ascending order:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int num = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int found = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == num) {
                found = mid;
                break;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found != -1) {
            System.out.println("Element found at index: " + found);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}



Enter the number of elements: 5
Enter 5 elements in ascending order:
10
20
30
40
50
Enter the element to search: 40
Element found at index: 3
