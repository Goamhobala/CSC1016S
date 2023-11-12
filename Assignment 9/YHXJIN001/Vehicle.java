public class Vehicle{
  protected Student owner;
  protected int cylinders;
  protected String manufacturer;

  public Vehicle(Vehicle v){
    this(v.cylinders, v.manufacturer, v.owner);
  }
  public Vehicle(int cylinders, String manufacturer, Student owner){
    this.cylinders = cylinders;
    this.manufacturer = manufacturer;
    this.owner = owner;
  }

  public String toString(){
    return String.format("%s, %d cylinders, owned by %s, a %d-year old %s studying %s at %s. %s likes %s.", this.manufacturer, this.cylinders, this.owner.getName(), this.owner.getAge(), this.owner.getGender(), this.owner.getProgramOfStudy(), this.owner.getNameOfInstitution(), this.owner.getName(), this.owner.getHobbies());
  }
}