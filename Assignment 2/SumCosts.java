/* Jing Yeh
*  YHXJIN001
*  03 Aug 2023
*/ 

import java.util.Scanner;

public class SumCosts {
   /* This application class asks for prices of each item from the user
   *  and then prints the total cost of each item.
   */ 
    
   public static void main(String[] args){
      Currency rand = new Currency("R", "ZAR", 100);
      Scanner inputs = new Scanner(System.in);
      Money totalCost = new Money("R0", rand);
      
      while (true) {
         System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
         String itemCost = inputs.nextLine();
         if (itemCost.equals("D") || itemCost.equals("Done")) {
            break;
         }
         totalCost = totalCost.add(new Money(itemCost, rand));
      }
      
      inputs.close();
      System.out.println("Total: " + totalCost.toString());
   } 
}