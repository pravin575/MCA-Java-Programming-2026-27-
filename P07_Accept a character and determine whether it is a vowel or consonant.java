import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' || ch == 'A' ||
            ch == 'E' || ch == 'I' || ch == 'O' ||
            ch == 'U') {
            System.out.println("Vowel");
        } else if ((ch >= 'a' && ch <= 'z') ||
                   (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid character");
        }

        sc.close();
    }
}


Enter a character: a
Vowel
Input and Output 2
Enter a character: E
Vowel
Input and Output 3
Enter a character: b
Consonant
Input and Output 4
Enter a character: 5
Invalid character
