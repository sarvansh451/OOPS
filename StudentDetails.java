import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = scanner.nextInt();

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        System.out.println("\nDetails of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll No: " + students[i].roll + ", Name: " + students[i].name + ", CGPA: " + students[i].cgpa);
        }

        double lowestCGPA = students[0].cgpa;
        String lowestCGPAStudentName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCGPA) {
                lowestCGPA = students[i].cgpa;
                lowestCGPAStudentName = students[i].name;
            }
        }

        System.out.println("\nStudent with the lowest CGPA: " + lowestCGPAStudentName + " (CGPA: " + lowestCGPA + ")");

        scanner.close();
    }
}
