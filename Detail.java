import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        acc_no = scanner.nextInt();
        System.out.println("Enter balance:");
        balance = scanner.nextDouble();
        scanner.close();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    @Override
    public void disp() {
        super.disp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter Aadhar number:");
        aadhar_no = scanner.nextLong();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        scanner.close();
    }
}

public class Detail {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person " + (i+1) + ":");
            persons[i] = new Person();
            persons[i].input();
            scanner.nextLine(); // Consume newline
            persons[i].disp();
            System.out.println();
        }
        scanner.close();
    }
}
