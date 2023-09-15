// A java application class that simulates the car parjk
// Jing Yeh
// YHXJIN001
// 21 Aug 2023

import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and ...
 * @version 14/7/2019
 */
public class CarParkSim {
        
   public static void main(final String[] args) {
      final Scanner keyboard = new Scanner(System.in);
      final Clock clock = new Clock(new Time("0:00"));
      final Register register = new Register();
      final TariffTable tariffTable = new TariffTable(10);
      fillTariffTable(tariffTable);
        
        // YOUR CODE HERE.
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them. 
        
      System.out.println("Car Park Simulator");
        // YOUR CODE HERE.
        // Print current time.
      System.out.println(String.format("The current time is %s.", clock.examine().toString()));
        
      System.out.println("Commands: tariffs, advance {minutes}, arrive, depart, quit.");
      System.out.print(">");
      String input = keyboard.next().toLowerCase();
      while (!input.equals("quit")) {
         if (input.equals("advance")) {
                // YOUR CODE HERE.
                // Advance the clock, print the current time.
            clock.advance(new Duration("minute", Long.parseLong(keyboard.next())));
            System.out.printf("The current time is %s.\n",clock.examine().toString());
                
            }
         else if (input.equals("arrive")) {
                // YOUR CODE HERE.
                // Create a new ticket, add it to the register, print details of ticket issued.
            Ticket ticket = new Ticket(clock.examine());
            register.add(ticket);
            System.out.println(String.format("Ticket issued: %s.", ticket.toString())); 
            }
         else if (input.equals("depart")) {
                // YOUR CODE HERE.
                // Determine if ticket is valid, i.e. in the register.
                // If not, print error message.
                // If yes, retreive it, calculate duration of stay and print it.
            String ticketID = keyboard.next();
            if (!register.contains(ticketID)){
               System.out.println("Invalid ticket ID.");
               }
            else{
               Ticket ticket = register.retrieve(ticketID);
               Time currentTime = clock.examine();
               Duration timeStayed = ticket.age(currentTime);
               System.out.println(String.format("Ticket details: %s.", ticket.toString()));
               System.out.println(String.format("Current time: %s.", currentTime.toString()));
               System.out.println(String.format("Duration of stay: %s.", Duration.format(timeStayed, "minute")));
               System.out.println(String.format("Cost of stay : %s.", tariffTable.getTariff(timeStayed).toString()));
               }
            }
         
         else if (input.equals("tariffs")){
         // output the tariff table
            System.out.println(tariffTable.toString());
         }   
            
         else {
            System.out.println("That command is not recognised.");
            System.out.println("Commands: advance <minutes>, arrive, depart, quit.");
            }            
         System.out.print(">");
         input = keyboard.next().toLowerCase();
         }            
      System.out.println("Goodbye.");
      }
    
   private static void fillTariffTable(TariffTable t){
   // This method fills the tariff table
      Duration[] boundaries = new Duration[11];
      
      boundaries[0] = new Duration("minute", 0);
      boundaries[1] = new Duration("minutes", 30);
      boundaries[2] = new Duration("hour", 1);
      boundaries[3] = new Duration("hour", 3);
      boundaries[4] = new Duration("hour", 4);
      boundaries[5] = new Duration("hour", 5);
      boundaries[6] = new Duration("hour", 6);
      boundaries[7] = new Duration("hour", 8);
      boundaries[8] = new Duration("hour", 10);
      boundaries[9] = new Duration("hour", 12);
      boundaries[10] = new Duration("day", 1);
      
      Money[] tariffs = new Money[10];
      Currency rand = new Currency("R", "ZAR", 100);
      tariffs[0] = new Money("R10.00", rand);
      tariffs[1] = new Money("R15.00", rand);
      tariffs[2] = new Money("R20.00", rand);
      tariffs[3] = new Money("R30.00", rand);
      tariffs[4] = new Money("R40.00", rand);
      tariffs[5] = new Money("R50.00", rand);
      tariffs[6] = new Money("R60.00", rand);
      tariffs[7] = new Money("R70.00", rand);
      tariffs[8] = new Money("R90.00", rand);
      tariffs[9] = new Money("R100.00", rand);
      
      for (int i = 0; i < 10; i++){
        TimePeriod period = new TimePeriod(boundaries[i], boundaries[i+1]);
        t.addTariff(period, tariffs[i]);
      } 
   
      
      }

   }
