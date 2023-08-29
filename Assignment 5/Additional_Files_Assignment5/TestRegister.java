public class TestRegister
{
    public static void main(String[] args){
        
        Register r = new Register();
       r.add(new Ticket(new Time("0:00"), "12123"));       
       r.add(new Ticket(new Time("0:00"), "12223"));
     r.add(new Ticket(new Time("0:00"), "22123"));
     r.add(new Ticket(new Time("0:00"), "2232a"));
     System.out.println(r.contains("22123"));
     System.out.println(r.contains("12345"));
     System.out.println(r.retrieve("12123").toString());
     System.out.println(r.retrieve("2232a").toString());
    
    }
}