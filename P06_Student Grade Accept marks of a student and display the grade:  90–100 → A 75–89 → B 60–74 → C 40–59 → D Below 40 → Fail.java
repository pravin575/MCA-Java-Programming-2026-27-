import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}



Enter student marks: 95
Grade: A
Input and Output 2
Enter student marks: 80
Grade: B
Input and Output 3
Enter student marks: 65
Grade: C
Input and Output 4
Enter student marks: 45
Grade: D
Input and Output 5
Enter student marks: 30
Grade: Fail
Input and Output 6
Enter student marks: 110
Invalid marks
