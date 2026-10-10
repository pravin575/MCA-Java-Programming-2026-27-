import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(num + " exists in the array.");
        } else {
            System.out.println(num + " does not exist in the array.");
        }

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
Enter the number to search: 30
30 exists in the array.



  Enter the number of elements: 5
Enter 5 integers:
10
20
30
40
50
Enter the number to search: 60
60 does not exist in the array.
