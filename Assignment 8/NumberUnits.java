public class NumberUtils{
/**
* The NumberUtils class contains a collection of routines for working with integers.
*/
   private NumberUtils(){
    /**
    * A private, empty-bodied constructor prevents NumberUtil objects from being created.
    */ 
      };
    
   public static int[] toArray(int number){
    /**
    * Given a number that is n digits in length, maps the digits to an array length n.
    * e.g. given the number 5678, the result is the array {5, 6, 7, 8}.
    */
       
      String numberStr = Integer.toString(number);
      int lengthArray = numberStr.length();
      int[] numberArray = new int[lengthArray];
      for (int i = 0; i < lengthArray; i++){
        numberArray[i] = Integer.parseInt(Character.toString(numberStr.charAt(i)));
      }
      return numberArray;
      }
    
   public static int countMatches(int numberA, int numberB){
      int[] numberArrayA = toArray(numberA);
      int[] numberArrayB = toArray(numberB);
      int matches = 0;
      for (int i=0; i<numberArrayA.length; i++){
        // Just playing around with branchless programming
         matches += (numberArrayA[i] == numberArrayB[i]) ? 1 : 0;
         }
      return matches;
      }
    
   public static int countIntersect(int numberA, int numberB){
      int[] numberArrayA = toArray(numberA);
      int[] numberArrayB = toArray(numberB);
      int matches = 0;
      for (int i=0; i<numberArrayA.length; i++){
         for(int j=0; j<numberArrayB.length; j++){
             if(numberArrayA[i] == numberArrayB[j]){
                 matches += 1;
                 break;
             }
         }
      }
      return matches;
      }
    
    
   }