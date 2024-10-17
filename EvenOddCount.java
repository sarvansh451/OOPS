
import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        scanner.close();

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}