//A shift object represents a given shift
//Jing Yeh
//YHXJIN001
//14 September 2023 

public class Shift{
    private CalendarTime start;
    private CalendarTime finish;
    
    public Shift(CalendarTime start, CalendarTime finish){
        this.start = start;
        this.finish = finish;
    }
    
    public CalendarTime start(){
        return this.start;
    }
    
    public CalendarTime finish(){
        return this.finish;
    }
    
    public boolean inWeek(Week w){
        return (w.includes(this.start.date()) && w.includes(this.finish.date()));
    }
    
    public boolean includesDate(Date date){
        // Making the assumption that a shift cannot span for more than 2 days
        return (this.start.date().compareTo(date) == 0 || this.finish.date().compareTo(date) == 0);
    }
    
    public Duration length(){
        return (this.finish.subtract(this.start));
    }
    
    public String toString(){
        return String.format("%s%%%s - %s%%%s",
        this.start.date().toString(), this.start.time().toString(),
        this.finish.date().toString(), this.finish.time().toString()
        );
    }
}