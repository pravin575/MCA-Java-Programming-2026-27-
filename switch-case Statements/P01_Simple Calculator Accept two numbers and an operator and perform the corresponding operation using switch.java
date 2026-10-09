import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case '%':
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Cannot calculate remainder with zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}



Input:

Enter first number: 10
Enter second number: 5
Enter operator (+, -, *, /, %): +

Output:

Result: 15.0
Input and Output 2: Multiplication

Input:

Enter first number: 6
Enter second number: 4
Enter operator (+, -, *, /, %): *

Output:

Result: 24.0
Input and Output 3: Division

Input:

Enter first number: 20
Enter second number: 4
Enter operator (+, -, *, /, %): /

Output:

Result: 5.0
Input and Output 4: Modulus

Input:

Enter first number: 10
Enter second number: 3
Enter operator (+, -, *, /, %): %

Output:

Result: 1.0
