import java.util.Scanner;

class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of natural numbers: " + sum);

        sc.close();
    }
}


Input and Output 1
  
Enter a number: 5
Sum of natural numbers: 15


Input and Output 2
  
Enter a number: 10
Sum of natural numbers: 55
