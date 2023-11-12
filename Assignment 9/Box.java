import java.util.Scanner;

public class Box extends Product{
    private int memory;
    
    public Box(){
        super();
        this.memory = 0;
    }
    public Box(String serialNumber, String manufacturer, String colour, int memory){
        super(serialNumber, manufacturer, colour);
        this.memory = memory;
    } 
    
    
    @Override
    public String toString(){
        return String.format("Box: %s, %s, %s, %d", this.serialNumber, this.manufacturer, this.colour, this.memory);
    }
    
    public static void askInputs(Scanner input, Box box){
        Product.askInputs(input, box);
        System.out.println("Enter the amount of memory (MB)");
        box.memory = input.nextInt();
        input.nextLine();
    }
}       