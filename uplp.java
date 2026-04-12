//this code converts any alphabet to uppercase and lowecase alphabet

import java.util.*;
public class uplp{
    public static void main(String[] args){
        Scanner rj = new Scanner(System.in);
        System.out.println("enter any word :");
        String name = rj.nextLine();
        System.out.println("Original name "+ ":"+ name);
        System.out.println("length"+":"+ name.length()); 
        System.out.println("uppercase"+":"+ name.toUpperCase());
        System.out.println("lowecase "+":"+ name.toLowerCase());
        
        rj.close();

    }
}