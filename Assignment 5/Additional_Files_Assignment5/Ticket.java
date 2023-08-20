public class Ticket {
    private Time currentTime;
    private String id;
    
    public Ticket(Time currentTime, String ID){
        this.currentTime = currentTime;
        this.id = ID;
    }
    
    public String ID(){
        return this.id;    
    }
    
    public Duration age(Time currentTime){
        return currentTime.subtract(this.currentTime);
    } 
    public String toString(){
        return String.format("Ticket[id=\"%s\", time=\"%s\"].", this.id, this.currentTime.toString());
    }
}

