import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int count = 0;
        num = Math.abs(num);

        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}



Input:

Enter an integer: 12345

Output:

Number of digits: 5
