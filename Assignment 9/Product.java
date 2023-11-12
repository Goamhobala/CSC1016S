import java.util.Scanner;

public abstract class Product{
    protected String serialNumber;
    protected String manufacturer;
    protected String colour;
    
    public Product(){
        this.serialNumber = "0";
        this.manufacturer = "0";
        this.colour = "0";
    }
    
    public Product(String serialNumber, String manufacturer, String colour){
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }
    
    public String getSerialNumber(){
        return this.serialNumber;
    }
    
    public String getManufacturer(){
        return this.manufacturer;
    }
    
    public String getColour(){
        return this.colour;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
    
    public abstract String toString();
    
    public static void askInputs(Scanner input, Product product){
        System.out.println("Enter the serial number");
        product.setSerialNumber(input.nextLine());
        System.out.println("Enter the manufacturer");
        product.setManufacturer(input.nextLine());
        System.out.println("Enter the colour");
        product.setColour(input.nextLine()); 
        
      
    }
}