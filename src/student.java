package src;
//student detail 

import java.util.*;
public class student {
    int rollno;
    String name;
    double marks;

    // user input
        Scanner sc = new Scanner(System.in);{
        System.out.print("Enter Roll No: ");
        rollno = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        }
        //this fn show the detail of the entry
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        //object create to see 
        student s1 = new student();
        s1.displayDetails(); 
    }
}