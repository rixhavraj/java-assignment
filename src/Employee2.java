package src;
//emp details 

import java.util.*;
public class Employee2 {
// use of static string 
    int empId;
    String name;
    static String owner = "RISHAV";
    static String companyName = "STALLERBEE";
    static String motive = "EXPLORE THE UNIVERSE";
    double salary = 4000;
    Employee2(int id, String name, double salary){
        this.empId = id;
        this.name = name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee Id: " +empId + "\nEmployee name: " + name + "\nSalary: "+ "$"+salary+ "\nCompany: " + companyName + "\nOwner: " + owner + "\nMotive: "+ motive);
    }
    public static void main(String[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID for Employee 1: ");
        int id1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name for Employee 1: ");
        String name1 = sc.nextLine();
        System.out.println("Enter the salary: ");
        double s1 = sc.nextDouble();
        System.out.print("\nEnter ID for Employee 2: ");
        int id2 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name for Employee 2: ");
        String name2 = sc.nextLine();
         System.out.println("Enter the salary: ");
        double s2 = sc.nextDouble();
        // Creating objects 
        Employee2 r1 = new Employee2(id1, name1, s1);
        Employee2 r2 = new Employee2(id2, name2, s2);
        //output
        System.out.println("");
        r1.display();
        System.out.println("\n");
        r2.display();
        sc.close();
    }
}