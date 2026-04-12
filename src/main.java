package src;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect a program to run:");
            System.out.println("1. Arr (student marks array)");
            System.out.println("2. CollegeStudent (student details)");
            System.out.println("3. Employee (constructor example)");
            System.out.println("4. Employee2 (static company name)");
            System.out.println("5. Product (getters/setters)");
            System.out.println("6. ProductBilling (method overloading)");
            System.out.println("7. student (student object details)");
            System.out.println("8. studentt (string operations)");
            System.out.println("9. Exit");
            int choice = readIntInRange(sc, "Enter choice: ", 1, 9);
            switch (choice) {
                case 1:
                    runArr(sc);
                    break;
                case 2:
                    runCollegeStudent(sc);
                    break;
                case 3:
                    runEmployee();
                    break;
                case 4:
                    runEmployee2(sc);
                    break;
                case 5:
                    runProduct(sc);
                    break;
                case 6:
                    runProductBilling();
                    break;
                case 7:
                    runStudent();
                    break;
                case 8:
                    runStudentt(sc);
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Please enter a valid option between 1 and 9.");
            }
        }
    }
    static void runArr(Scanner sc) {
        int[] arr = new int[5];
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readInt(sc, "Student " + (i + 1) + ": ");
        }
        System.out.println("\nStudent Marks");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student " + (i + 1) + " = " + arr[i] + " marks");
        }
    }
    static void runCollegeStudent(Scanner sc) {
        CollegeStudent cs = new CollegeStudent();
        cs.rollNo = readInt(sc, "Enter Roll No: ");
        System.out.print("Enter Name: ");
        cs.name = sc.nextLine();
        System.out.print("Enter College Name: ");
        cs.collegeName = sc.nextLine();

        System.out.println("\nRoll No: " + cs.rollNo);
        System.out.println("Name: " + cs.name);
        System.out.println("College Name: " + cs.collegeName);
    }
    static void runEmployee() {
        Employee2 r1 = new Employee2(21, "Rishav Raj", 50000);
        r1.display();
    }
    
    static void runEmployee2(Scanner sc) {
        int id1 = readInt(sc, "Enter ID for Employee 1: ");
        System.out.print("Enter Name for Employee 1: ");
        String name1 = sc.nextLine();
        int id2 = readInt(sc, "Enter ID for Employee 2: ");
        System.out.print("Enter Name for Employee 2: ");
        String name2 = sc.nextLine();

        Employee2 r1 = new Employee2(id1, name1);
        Employee2 r2 = new Employee2(id2, name2);

        System.out.println();
        r1.display();
        r2.display();
    }

    static void runProduct(Scanner sc) {
        Product p = new Product();
        p.setProductId(readInt(sc, "Enter Product ID: "));
        System.out.print("Enter Product Name: ");
        p.setProductName(sc.nextLine());
        p.setPrice(readDouble(sc, "Enter Price: "));
        System.out.println();
        System.out.println("Product ID- " + p.getProductId());
        System.out.println("Product Name- " + p.getProductName());
        System.out.println("Price- " + p.getPrice());
    }

    static void runProductBilling() {
        ProductBilling pb = new ProductBilling();
        System.out.println(pb.bill(100));
        System.out.println(pb.bill2(100, 200));
        System.out.println(pb.bill3(100, 200, 300));
        System.out.println("-------------");
    }
    static void runStudent() {
        student s1 = new student();
        s1.displayDetails();
    }
    static void runStudentt(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Original name: " + name);
        System.out.println("length: " + name.length());
        System.out.println("uppercase: " + name.toUpperCase());
        System.out.println("lowercase: " + name.toLowerCase());
    }

    static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    static int readIntInRange(Scanner sc, String prompt, int min, int max) {
        while (true) {
            int value = readInt(sc, prompt);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Please enter a number between " + min + " and " + max + ".");
        }
    }

    static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
