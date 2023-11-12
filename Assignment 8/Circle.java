public class Circle extends Shape{
    private double radius;
    
    public Circle(Circle c){
        this(c.name, c.colour, c.radius);
    }
    
    public Circle(String name, String colour, double radius){
        super(name, colour);
        this.radius = radius;
    }

@Override
    public String toString(){
        return super.toString() + " Radius " + this.radius;
    }
}