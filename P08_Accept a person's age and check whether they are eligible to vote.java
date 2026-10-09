import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else if (age >= 0) {
            System.out.println("Not eligible to vote");
        } else {
            System.out.println("Invalid age");
        }

        sc.close();
    }
}


Enter your age: 20
Eligible to vote
Input and Output 2
Enter your age: 16
Not eligible to vote
Input and Output 3
Enter your age: -5
Invalid age
