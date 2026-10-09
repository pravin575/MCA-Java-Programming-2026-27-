import java.util.Scanner;

class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle = " + (3.14 * radius * radius));
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                System.out.println("Area of Rectangle = " + (length * breadth));
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                System.out.println("Area of Triangle = " + (0.5 * base * height));
                break;

            case 4:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                System.out.println("Area of Square = " + (side * side));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}



1. Circle
2. Rectangle
3. Triangle
4. Square
Enter your choice: 2
Enter length: 10
Enter breadth: 5
Area of Rectangle = 50.0
