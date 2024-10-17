import java.util.Scanner;

class Rectangle{
    double length;
    double breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Area of Rectangle with default values: " + defaultRectangle.calculateArea());

        System.out.print("Enter the length of the rectangle: ");
        double userLength = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double userBreadth = scanner.nextDouble();

        Rectangle userRectangle = new Rectangle(userLength, userBreadth);
        System.out.println("Area of Rectangle with user input values: " + userRectangle.calculateArea());

        scanner.close();
    }
}