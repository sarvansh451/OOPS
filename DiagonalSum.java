import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3x3 matrix:");

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int left = 0;
        for (int i = 0; i < 3; i++) {
            left += matrix[i][i];
        }

        int right = 0;
        for (int i = 0; i < 3; i++) {
            right += matrix[i][2 - i];
        }

        System.out.println("Left Diagonal Sum: " + left);
        System.out.println("Right Diagonal Sum: " + right);
        scanner.close();
    }
   
}
