import java.util.Scanner;
import java.util.ArrayList;

public class Question1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<Product>();
        System.out.println("Welcome to Great International Technology");
        while (true){
            System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
            String option = input.nextLine().toLowerCase();
            boolean found = true;
            
            if (option.equals("b")){
                Box b = new Box();
                Box.askInputs(input, b);
                b.getColour();
                productList.add(b);
                
            
            }
            else if (option.equals("s")){
                Screen s = new Screen();
                Screen.askInputs(input, s);
                productList.add(s);
                
            }
            else if (option.equals("a")){
                Accessory a = new Accessory();
                Accessory.askInputs(input, a);
                productList.add(a);
                
            }
            else if (option.equals("d")){
                System.out.println("Enter the serial number");
                String target = input.nextLine();
                found = productList.removeIf(p -> p.getSerialNumber().equals(target));
            }
            else if (option.equals("l")){
                for (Product p: productList){
                    System.out.println(p);
                }
            }
            else if (option.equals("q")){
                break;
            }
            System.out.println(found ? "Done" : "Not found" );
        }
    }
}
