// This class creates an employee object from the perspective of attendance management;
// Jing Yeh
// YHXJIN001
// 14 September 2023 

import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String uid;
    private String name;
    private CalendarTime signIn;
    private CalendarTime signOut;
    private List<Shift>  shifts;
    
    public Employee(String name, String uid){
        this.uid = uid;
        this.name = name;
        this.shifts= new ArrayList<Shift>();
    }
    
    public String name(){
        return this.name;
    }
    
    public String UID(){
        return this.uid;
    }
    
    public void signIn(Date d, Time t){
        this.signIn = new CalendarTime(d, t);
    }
    
    public void signOut(Date d, Time t){
        this.signOut = new CalendarTime(d, t);
        this.shifts.add(new Shift(this.signIn, this.signOut));
        this.signOut = null;
        this.signIn = null;
        
    }
    
    public boolean present(){
        return (this.signIn != null && this.signOut == null);
    }
    
    public boolean worked(Date d){
        for (Shift s: this.shifts){
            if (s.includesDate(d)){
                System.out.println(d);
                return true;
            }
        }
        return false;
    }
    
    public boolean worked(Week w){
        for (Shift s: this.shifts){
            if (s.inWeek(w)){
                return true;
            }
        }
        return false;
    }
    
    public List<Shift> get(Date d){
        List<Shift> included = new ArrayList<Shift>();
        for (Shift s: this.shifts){
            if (s.includesDate(d)){
                included.add(s);
            }  
        }
        return included;
    }
    
    public List<Shift> get(Week w){
        List<Shift> included = new ArrayList<Shift>();
        for (Shift s: this.shifts){
            if (s.inWeek(w)){
                included.add(s);
            }
        }
        return included;
    }
    
    public Duration hours(Week w){
        Duration total = new Duration("minute", 0);
        for (Shift s: this.get(w)){
            total = total.add(s.length());
        }
        return total;
    }
}