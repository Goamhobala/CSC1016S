import java.util.Scanner;

public class Screen extends Product{
    private int screenSize;
    
    public Screen(String serialNumber, String manufacturer, String colour, int screenSize){
        super(serialNumber, manufacturer, colour);
        this.screenSize = screenSize;
    } 
    
    public Screen(){
        super();
        this.screenSize = 0;
    }
    
    @Override
    public String toString(){
        return String.format("Screen: %s, %s, %s, %d", this.serialNumber, this.colour, this.manufacturer, this.screenSize);
    }
    
    public static void askInputs(Scanner input, Screen screen){
        Product.askInputs(input, screen);
        System.out.println("Enter the screen size in inches");
        screen.screenSize = input.nextInt();
        input.nextLine();
    }
}       