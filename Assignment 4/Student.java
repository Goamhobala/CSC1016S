// A Student class that creates a student object with first name, middle name, and last name
// Jing Yeh
// 15 Aug 2023  

public class Student{
   private String firstName;
   private String middleName;
   private String initial;
   private String lastName;
   
   public Student(){};
   
   public void setNames(String firstName, String middleName, String lastName){
      // Setter for instance variables
      this.firstName = firstName;
      this.middleName = middleName;
      this.initial = middleName.charAt(0) + ".";
      this.lastName = lastName;
   }
   
   public String getFullName(){
      // Return the full name as a string with the middle name initialised.
      return String.format("%s %s %s", this.firstName, this.initial, this.lastName);
   }
}