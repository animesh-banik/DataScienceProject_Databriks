
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();
        int number = 23;
        int reversed = 0;
            while (number != 0) {
                int digit = number % 10;       // Get last digit
                reversed = reversed * 10 + digit;  // Append to reversed
                number /= 10;                 // Remove last digit
            }
        System.out.println("Reversed number: " + reversed);
    }
}

