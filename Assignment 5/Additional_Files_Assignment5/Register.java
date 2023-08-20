// A class that creates a Register object that stores all the tickets
// Jing Yeh
// 20 Aug 2023

import java.util.Arrays;
import java.util.Comparator;

public class Register{
    
    private Ticket[] tickets = new Ticket[100];
    private int numTickets;
    // Comparator for tickets
    private Comparator<Ticket> ticketsComparator = Comparator.comparingInt((ticket) -> Integer.parseInt(ticket.ID()));
   
    public Register(){
        this.numTickets = 0;
    };
    
    public void add(Ticket ticket){
        this.tickets[numTickets] = ticket;
        this.numTickets++;
    }
       
    private int indexOfTicketWithId(String id){
    // to find the index of the ticket with a certain ID using binary search
        Arrays.sort(this.tickets, 0, this.numTickets, this.ticketsComparator);
        return Arrays.binarySearch(this.tickets, 0, this.numTickets, new Ticket(new Time("0:00"), id), this.ticketsComparator);
    }
    

    public boolean contains(String ticketID){
        return (this.indexOfTicketWithId(ticketID) >= 0);
    }
    
    public Ticket retrieve(String ticketID){
        return tickets[this.indexOfTicketWithId(ticketID)];
    }
}   
    
