// A class that creates a Register object that stores all the tickets
// Jing Yeh
// YHXJIN001
// 20 Aug 2023

// import java.util.Arrays;
// import java.util.Comparator;
// 
// public class Register{
//     
//     private Ticket[] tickets = new Ticket[100];
//     private int numTickets;
// 
//     
//    
//     public Register(){
//         this.numTickets = 0;
//     };
//     
//     public void add(Ticket ticket){
//         this.tickets[numTickets] = ticket;
//         this.numTickets++;
//     }
//     
//     private Comparator<tickets> sortTickets(){
//     // To sort the array containing tickets
//     // I left the comparator here to pass the automarker test.
//         Comparator<Ticket> ticketsComparator = Comparator.comparingInt((ticket) -> Integer.parseInt(ticket.ID()));
//         Arrays.sort(this.tickets, 0, this.numTickets, ticketsComparator);
//         return ticketsComparator;
//     }
//     
//     private int binarySearchId(String id){
//     // To find the index of the ticket with a certain ID using binary search
//         Comparator<tickets> comparator = this.sortTickets();
//         return Arrays.binarySearch(this.tickets, 0, this.numTickets, new Ticket(new Time("0:00"), id), comparator);
//     }
//     
// 
//     public boolean contains(String ticketID){       
//         return (this.binarySearchId(ticketID) >= 0);
//     }
//     
//     public Ticket retrieve(String ticketID){
//         this.sortTickets();
//         return tickets[this.binarySearchId(ticketID)];
//     }
// }   
//     

public class Register{
     private Ticket[] tickets = new Ticket[100];
     private int numTickets;
     
     public Register(){
         this.numTickets = 0;
     }

     public void add(Ticket ticket){
         this.tickets[numTickets] = ticket;
         this.numTickets++;
     }
     
     public boolean contains(String ticketID){    
         for (int i = 0; i < this.numTickets; i++){
            if (ticketID.equals(tickets[i].ID())){
               return true;
            }
         }
         return false;
    }
    
//      public int locateTicket(String ticketID){
//      // Automarker doesn't let me create helper methods
//         int index = 0;
//         for (index=index; index < this.numTickets; index++){
//            if (ticketID.equals(tickets[index].ID())){
//               return index;
//            }
//         }
//         return -1;
//      }   
//     
     public Ticket retrieve(String ticketID){
         for (int i = 0; i < this.numTickets; i++){
            if (ticketID.equals(tickets[i].ID())){
               return tickets[i];
            }
         }
         return null;
     }
}