import java.util.Scanner;

class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of the first array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nElements of the second array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
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
Elements of the first array:
10 20 30 40 50
Elements of the second array:
10 20 30 40 50
