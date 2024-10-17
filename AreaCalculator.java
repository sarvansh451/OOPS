import java.util.Scanner;

public class AreaCalculator {
    public static double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + area(radius));
                break;
            case 2:
                System.out.println("Enter the base of the triangle:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + area(base, height));
                break;
            case 3:
                System.out.println("Enter the side of the square:");
                int side = scanner.nextInt();
                System.out.println("Area of the square: " + area(side));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
