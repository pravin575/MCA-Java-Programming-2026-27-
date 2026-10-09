import java.util.Scanner;

class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Not a Vowel");
        }

        sc.close();
    }
}



Input:

Enter a character: a

Output:

Vowel
Input and Output 2

Input:

Enter a character: E

Output:

Vowel
Input and Output 3

Input:

Enter a character: b

Output:

Not a Vowel
