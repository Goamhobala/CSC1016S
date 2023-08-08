// TestSeller.java
/* Jing Yeh
*  YHXJIN001
*  8 August 2023
*/ 
import java.util.Scanner;
   
public class TestSeller{
   private static Currency RAND = new Currency("R", "ZAR", 100);
   public static void main(String[] args){
      Scanner inputs = new Scanner(System.in);
      Seller seller = new Seller();
      
      System.out.println("Please enter the details of the seller.");
      seller.ID = getInput("ID: ", inputs);
      
      seller.Name = getInput("Name: ", inputs);
      
      seller.Location = getInput("Location: ", inputs);
      
      System.out.print("Product: ");
      seller.Product = inputs.nextLine();
      
      seller.unit_price = new Money(getInput("Price: ", inputs), RAND);
      
      System.out.print("Units: ");
      seller.number_of_units = inputs.nextInt();
      
      
      System.out.println("The seller has been successfully created:");
      System.out.println("ID of the seller: " + seller.ID);
      System.out.println("Name of the seller: " + seller.Name);
      System.out.println("Location of the seller: " + seller.Location);
      System.out.println("The product to sell: " + seller.Product);
      System.out.println("Product unit price: " + seller.unit_price.toString());
      System.out.println("The number of available units: " + Integer.toString(seller.number_of_units));
      
      
   }
   private static String getInput(String message, Scanner inputs){
      System.out.print(message);
      String input = inputs.next();
      inputs.nextLine();
      return input;
   }
}