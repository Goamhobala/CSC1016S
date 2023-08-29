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
        // YOUR CODE HERE.
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them. 
        
        System.out.println("Car Park Simulator");
        // YOUR CODE HERE.
        // Print current time.
        System.out.println(String.format("The current time is %s.", clock.examine().toString()));
        
        System.out.println("Commands: advance {minutes}, arrive, depart, quit.");
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
                Ticket ticket = new Ticket(clock.examine(), UIDGenerator.makeUID());
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
                    System.out.println(String.format("Ticket details: %s.", ticket.toString()));
                    Time currentTime = clock.examine();
                    System.out.println(String.format("Current time: %s.", currentTime.toString()));
                    System.out.println(String.format("Duration of stay: %s.", Duration.format(ticket.age(currentTime), "minute")));
                }
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

}
