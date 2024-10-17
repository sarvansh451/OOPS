import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

       
        System.out.print("Enter Roll No: ");
        String rollNo = scanner.nextLine();


        System.out.print("Enter Section: ");
        String section = scanner.nextLine();


        System.out.print("Enter Branch: ");
        String branch = scanner.nextLine();

        // Close the Scanner after taking input
        scanner.close();

    
        System.out.println("Display Name: " + name);
        System.out.println("Display Roll No: " + rollNo);
        System.out.println("Display Section: " + section);
        System.out.println("Display Branch: " + branch);
    }
}
