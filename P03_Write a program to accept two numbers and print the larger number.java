import java.util.Scanner;

class LargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Larger number is: " + a);
        } else if (b > a) {
            System.out.println("Larger number is: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}


Enter first number: 10
Enter second number: 30
Larger number is: 30
