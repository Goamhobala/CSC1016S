public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(Rectangle r){
        this(r.name, r.colour, r.length, r.width);
    }
    
    public Rectangle(String name, String colour, double length, double width){
        super(name, colour);
        this.length = length;
        this.width = width;
    }
    
@Override
    public String toString(){
        return super.toString() + " Length " + this.length + " Width " + this.width;
    }
}