public class TestNumberUnits{
    public static void main(String[] args){
        int numberA = 12345;
        int numberB = 23451;
        
      // //   System.out.println(NumberUnits.countMatches(numberA, numberB)); 
        System.out.println(NumberUnits.countIntersect(numberA, numberB));
        System.out.println(NumberUnits.countMatches(numberA, numberB));
        System.out.println(NumberUnits.countMatches(5687, 8657));
        
    }
}