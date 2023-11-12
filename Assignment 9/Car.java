public class Car extends Vehicle{
    private double weight;
    private int capacity;

    public Car(Car c){
        this(c.cylinders, c.manufacturer, c.owner, c.capacity, c.weight);
    }

    public Car(int numCylinders, String maker, Student owner, int passengers, double carWeight){
        super(numCylinders, maker, owner);
        this.capacity = passengers;
        this.weight = carWeight;
    }
@Override
    public String toString(){
        return super.toString() + String.format("\nThe car is a %d-seater weighing %.1f kg", this.capacity, this.weight);
    }
}