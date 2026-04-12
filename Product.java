//product details using private, getter and setter methods

import java.util.Scanner;
public class Product {
    // using private 
    private int productId;
    private String productName;
    private double price;

    // Setters to set the values of private variables
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //getter method is used to get the values of private varible
     public int getProductId() {
        return productId;}
      public String getProductName() {
        return productName;}
        public double getPrice() {
        return price; }
        public static void main(String[] args) {
        //create scanner object
        Scanner rr = new Scanner(System.in);
        Product p = new Product();
        
        // take  input
        System.out.print("Enter Product ID: ");
        p.setProductId(rr.nextInt());
        rr.nextLine();
         System.out.print("Enter Product Name: ");
        p.setProductName(rr.nextLine());
         System.out.print("Enter Price: ");
        p.setPrice(rr.nextDouble());

        //output
        System.out.println("");
        System.out.println("Product ID- " + p.getProductId());
        System.out.println("Product Name- " + p.getProductName());
        System.out.println("Price- " + "$"+p.getPrice());
        rr.close();
    }
}