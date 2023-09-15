// A class that defines the ticket data type
// Jing Yeh
// YHXJIN001
// 21 Aug 2023

public class Ticket {
    private Time issueTime;
    private String id;
    
    public Ticket(Time currentTime, String ID){
        this.issueTime = currentTime;
        this.id = ID;
    }
    
    public String ID(){
        return this.id;    
    }
    
    public Duration age(Time currentTime){
        return currentTime.subtract(this.issueTime);
    } 
    public String toString(){
        return String.format("Ticket[id=%s, time=%s]", this.id, this.issueTime.toString());
    }
}

