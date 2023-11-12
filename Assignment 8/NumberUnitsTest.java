import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class NumberUnitsTest {
    
    int numberA;
    int numberB;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
        int numberA = 12345;
        int numberB = 23451;
   }


//    /** A test that always fails. **/
//    @Test public void defaultTest() {
//       Assert.assertEquals("Default test added by jGRASP. Delete "
//             + "this test once you have added your own.", 0, 1);
//    }
    @Test public void testToArray(){
        
        Assert.assertArrayEquals(NumberUnits.toArray(numberA), new int[]{1, 2 ,3 ,4 ,5});
    }
    

}
