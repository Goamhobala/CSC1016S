// A test suite for the class Time and Duration;
// Jing Yeh
// 14 Aug 2023

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestOfTime {

   private Time testTime1; 
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      testTime1 = new Time("01:00");
      
   }

   @Test public void testTimeStorage(){
   // Test if the time is stored correctly in the Time type object
      String result = testTime1.toString();
      assertEquals(result, "01:00:00");
   
   }
   
   @Test public void testTimeSubtractAnother(){
   // Test if the subtract method of Time type objects functions correctly with 2 time objects
     Time testTime2 = new Time("02:37");
     Duration result = testTime2.subtract(testTime1);
     Duration memo = new Duration(5820000);
     assertTrue(result.equals(memo));
   }
   
   @Test public void testTimeSubtractItself(){
   // Test if the subtract method of Time type objects functions correctly when the same object is used as argument.
     Duration result = testTime1.subtract(testTime1);
     Duration memo = new Duration(0);
     assertTrue(result.equals(memo));
   }
   
   @Test public void testDurationIntValueMilliesecond(){
   // Check if the intValue method of the Duration type objects functions correctly when milisecond is used as time unit.
     Duration result = testTime1.asDuration();
     assertEquals(result.intValue("millisecond"), 3600000);
   }
   
   @Test public void testDurationIntValueSecond(){
   // Check if the intValue method of the Duration type objects functions correctly when second is used as time unit.
     Duration result = testTime1.asDuration();
     assertEquals(result.intValue("second"), 3600);
   }
   
   @Test public void testDurationIntValueMinute(){
   // Check if the intValue method of the Duration type objects functions correctly when minute is used as time unit.
      Duration result = testTime1.asDuration();
      assertEquals(result.intValue("minute"), 60);
   }
   
   @Test public void testDurationIntValueHour(){
   // Check if the intValue method of the Duration type objects functions correctly when hour is used as time unit.
      Duration result = testTime1.asDuration();
      assertEquals(result.intValue("hour"), 1);
   }
}
