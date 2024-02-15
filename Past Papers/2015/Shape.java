public abstract class Shape {
    double x, y, size;

    public Shape(double x, double y, double len) {
        this.x = x;
        this.y = y;
        size = len;
    }

    public abstract void area();

    public String toString() {
        return " at " + x + "," + y + " size " + size;
    }
}

class Circle extends Shape {
    public Circle(double x, double y, double len) {
        super(x, y, len);
    }

    public void area() {
        System.out.println("Area:" + 3.14159 * size * size);
    }

    public String toString() {
        return "Circle " + super.toString();
    }
}

class Toy {
    private String colour;
    private Shape shp;

    public Toy(String c, Shape s) {
        colour = c;
        shp = s;
    }

    public String toString() {
        return "a " + colour + " " + shp;
    }

    public void moveShape(Shape s) {
        s.x = s.x + 1;
        s.y = s.y + 1;
        shp = s;
    }

    public static void main(String[] args) {
        Circle round = new Circle(3, 2, 1);
        System.out.println(round);
        round.area();
        Toy disc = new Toy("red", round);
        System.out.println(disc);
        Circle far = new Circle(8, 8, 1);
        disc.moveShape(far);
        System.out.println("disc " + disc);
        System.out.println("far " + far);
    }
}
