import java.util.Scanner;

class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- MENU -----");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Division: " + ((double) a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}


----- MENU -----
1. Add
2. Subtract
3. Multiply
4. Divide
Enter your choice: 1
Enter first number: 20
Enter second number: 10

Output:

Addition: 30


  Input:

Enter your choice: 2
Enter first number: 20
Enter second number: 10

Output:

Subtraction: 10
Input and Output 3: Multiplication

Input:

Enter your choice: 3
Enter first number: 5
Enter second number: 4

Output:

Multiplication: 20
Input and Output 4: Division

Input:

Enter your choice: 4
Enter first number: 20
Enter second number: 4

Output:

Division: 5.0


  
