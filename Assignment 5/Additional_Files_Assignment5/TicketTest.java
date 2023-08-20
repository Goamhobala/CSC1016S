import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TicketTest {

    private Ticket ticket;
    private Time time2;
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
    ticket = new Ticket(new Time("6:50"), "12345");
    time2 = new Time("7:50")
   }


  //  /** A test that always fails. **/
//    @Test public void defaultTest() {
//       Assert.assertEquals("Default test added by jGRASP. Delete "
//             + "this test once you have added your own.", 0, 1);
//    }

    @Test public void testID(){
        Assert.assertEquals(ticket.ID, "12345");
    }
    
    @Test public void testID(){
        Assert.assertEquals()
    }
}
