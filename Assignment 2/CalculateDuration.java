import java.util.Scanner;

public class CalculateDuration {
   private static Time timeBefore;
   private static Time timeAfter;
   

   public static void main(String[] args){
      Time[] inputData = getInputs();
      Duration duration = getDuration(inputData);
      System.out.println("The time " + timeAfter.toString() + " occurs " + duration.intValue("minute")
      + " minutes after the time " + timeBefore.toString() + ".");
      
   }
   
   private static Time[] getInputs(){
   
      try (Scanner input = new Scanner(System.in)){
         System.out.println("Enter time A:");
         timeBefore = new Time(input.nextLine());
         System.out.println("Enter time B:");
         timeAfter = new Time(input.nextLine());
      }
      return new Time[]{timeBefore, timeAfter};
               
   }
   
   private static Duration getDuration(Time[] inputData){
      return inputData[1].subtract(inputData[0]);
   }
} 