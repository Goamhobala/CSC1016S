/* Jing Yeh
*  YHXJIN001
*  8 August 2023
*/ 

import java.io.File;
import java.io.FileNotFoundException;
//
import java.util.Scanner;
import java.util.ArrayList;
/**
 * See Assignment II Question II
 *
 * @author Stephan Jamieson
 * @version 26/7/2019
 */
public class MarketPlace {
    
    private MarketPlace() {}
    
    private final static Currency RAND = new Currency("R", "ZAR", 100);
    
    
    // Create an instance of Seller with attributes ID, name, location, product, 
    // unit_price and number_of_units
    private static Seller makeSeller(final String data) {
        final Scanner scanner = new Scanner(data.trim());
        scanner.useDelimiter("\\s*,\\s*");
        
        // Add your code here
        Seller seller = new Seller();
        seller.ID = scanner.next();
        seller.Name = scanner.next();
        seller.Location = scanner.next();
        seller.Product = scanner.next();
        seller.unit_price = new Money(scanner.next(), RAND);
        seller.number_of_units = scanner.nextInt();
        
        return seller;
    }
    
    // Read the contents of CSV file into an array.
    // See the Appendix on page 4 of the Assignment sheet.
    private static Seller[] parseFile(final String fileName) throws FileNotFoundException {
        final Scanner inFile = new Scanner(new File(fileName));
        Seller[] sellers = null;
         
        if (inFile.hasNextLine()) {
            sellers = new Seller[Integer.parseInt(inFile.nextLine().trim())];
            
            
            
            for (int index=0; index<sellers.length; index++) {
                sellers[index] = makeSeller(inFile.nextLine());
            }
            
            if (sellers.length == 0){
               return null;
            }
            
        }
        inFile.close();
        return sellers;
    }
    
    private static String getInput(String message, Scanner inputs){
      System.out.println(message);
      return inputs.nextLine();
    }
    
    private static boolean filterSeller(Seller seller, String product, int unit, Money price){
      // This method returns a boolean expression if the seller object satisfies the condition
      return (seller.Product.equals(product) && seller.number_of_units >= unit && seller.unit_price.compareTo(price) <= 0);
      }
      
    private static void outputSellers(ArrayList<Seller> sellers){
    // This method outputs each seller in a formatted string. If the array is empty then it outputs none found
      if (sellers.size() == 0){
         System.out.println("None found.");
      }
      for (Seller seller: sellers){
         System.out.printf("%s : %s in %s has %d %s for %s each.\n", seller.ID, seller.Name, seller.Location, seller.number_of_units, seller.Product, seller.unit_price.toString());
      }
    }

   
    
    public static void main(final String[] args) throws FileNotFoundException {
        final Scanner inKey = new Scanner(System.in);
        System.out.println("Enter the name of a \"Comma Separated Values\" (CSV) file:");
        final Seller[] sellers = parseFile(inKey.nextLine());

        
        if (sellers == null){
         System.out.println("The file contains no seller data.");
         return;
        }
        
        final ArrayList<Seller> sellersFiltered = new ArrayList<Seller>();
       
        String productTarget = getInput("Enter the name of a product: ", inKey);
        int numberUnitsTarget = Integer.parseInt(getInput("Enter the number of units required: ", inKey));
        Money priceTarget = new Money(getInput("Enter the maximum unit price: ", inKey), RAND);
            
        for (Seller seller: sellers){
            if (filterSeller(seller, productTarget, numberUnitsTarget, priceTarget)){
               sellersFiltered.add(seller);
               }
        }
        outputSellers(sellersFiltered);
        inKey.close();
        
    }
}
