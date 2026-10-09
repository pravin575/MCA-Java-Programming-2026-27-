import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial of " + n + " is: " + fact);
        }

        sc.close();
    }
}


Input:

Enter a number: 5

Output:

Factorial of 5 is: 120
