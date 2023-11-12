public class Shape {
    protected String name;
    protected String colour;
    // Cannot use public since child classes need access to the instance variables but the automarker doesn't allow addition getter methods.
    
    public Shape(Shape s){
        this(s.name, s.colour);
    }
    
    public Shape(String name, String colour){
        this.name = name;
        this.colour = colour;
    }
    
    public String toString(){
        return this.name + " " + this.colour;
    }
}