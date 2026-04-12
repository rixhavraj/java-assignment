package src;
//marks of 5 students 
import java.util.Scanner;

public class stdmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // take input for 5 students
        int[] arr = new int[5]; 

        
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // prints output 
        System.out.println(" Student Marks");
        for (int i = 0; i < arr.length; i++) {
              System.out.println("student " + (i+1)+ " = " + arr[i] +" marks" );
        }

        sc.close();
    }
}