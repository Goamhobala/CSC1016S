/* Jing Yeh
   YHXJIN001
   01 Aug 2023
*/ 
import java.util.Scanner;

public class CalculateDuration {
/*
* This class takes two users inputs, stores them as time objects
* And outputs a formatted string that shows the time duration between the two time objects
*/
// Member variables  
   private static Time timeBefore;
   private static Time timeAfter;
   

   public static void main(String[] args){
      Time[] inputData = getInputs();
      Duration duration = getDuration(inputData);
      System.out.println("The time " + timeAfter.toString() + " occurs " + Long.toString(duration.intValue("minute"))
      + " minutes after the time " + timeBefore.toString() + ".");
   }
   
   private static Time[] getInputs(){

/*
* This method gets time A and time B from the user using the Scanner class
* And returns the two inputs as an array
*/    
      try (Scanner input = new Scanner(System.in)){
         System.out.println("Enter time A:");
         timeBefore = new Time(input.next());
         System.out.println("Enter time B:");
         timeAfter = new Time(input.next());
      }
      return new Time[]{timeBefore, timeAfter};
               
   }
   private static Duration getDuration(Time[] inputData){
/*
* This method takes an array with Time two time objects
* And returns the time difference between them two
*/
      return inputData[1].subtract(inputData[0]);
   }
} 