//students details

import java.util.*;
//parent class 
class StudentParent {
    int rollNo;
    String name;
    String collegeName;
}
// child class
public class CollegeStudent extends StudentParent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollegeStudent cs = new CollegeStudent();
        // Taking input
        System.out.print("Enter Roll No: ");
        cs.rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        cs.name = sc.nextLine();
        System.out.print("Enter College Name: ");
        cs.collegeName = sc.nextLine();
        // output
        System.out.println( "");
        System.out.println("Roll No: " + cs.rollNo);
        System.out.println("Name: " + cs.name);
        System.out.println("College Name: " + cs.collegeName);
        sc.close();
    }
}