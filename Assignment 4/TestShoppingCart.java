// An application class that tests the functionalities of the ShoppingCart class
// Jing Yeh
// 15 August 2023
 
import java.util.Scanner;

public class TestShoppingCart {
   private static Scanner input = new Scanner(System.in);
   
   public static void main(String[] args){
      ShoppingCart cart = new ShoppingCart();
      int numItems = Integer.parseInt(getInput("How many items would you like to add to your Shopping Cart?: "));
      if (numItems == 0){
         System.out.println("Your Shopping Cart is empty.");
         return;
      }
      
      for (int i=0; i <numItems; i++){
         String productName = getInput("Enter the Product Name: ");
         int quantity = Integer.parseInt(getInput("Enter the Quantity: "));
         double unitCost = Double.parseDouble(getInput("Enter the Unit Cost: "));
         cart.addItems(new Item(productName, quantity, unitCost));
      }            
      cart.getDiscount("WELCOME20");
      System.out.println("The Shopping Cart has the following items: ");
      cart.queryCart();
      System.out.println("--- Shopping Cart with all items ---");
      cart.printInvoice();      
   }
   
   private static String getInput(String message){
      System.out.println(message);
      return input.nextLine();
   }
}