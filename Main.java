import java.util.Scanner;

class Rect {
    double length;
    double breadth;

    Rect() {
        length = 0;
        breadth = 0;
    }

    Rect(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        Rect rectangle = new Rect(length, breadth);

        System.out.println("Area of the rectangle: " + rectangle.getArea());
        scanner.close();
    }
}
