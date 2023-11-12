import java.util.Scanner;

public class Accessory extends Product{
    public Accessory(String serialNumber, String manufacturer, String colour){
        super(serialNumber, manufacturer, colour);
    } 
    
    public Accessory(){
        super();
    }
    
    @Override
    public String toString(){
        return String.format("Accessories: %s, %s, %s", this.serialNumber, this.manufacturer, this.colour);
    }
    
    public static void askInputs(Scanner input, Accessory accessory){
        Product.askInputs(input, accessory);
    }
}       