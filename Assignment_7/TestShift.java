public class TestShift{
   public static void main(String[] args){
      CalendarTime start = new CalendarTime("1/9/2019%22:00");
      CalendarTime finish = new CalendarTime("2/9/2019%06:00");
      Shift shift = new Shift(start, finish);
      System.out.println(shift);
      System.out.println(shift.start());
      System.out.println(shift.finish());
      System.out.println(shift.includesDate(new Date("31/8/2019")));
      System.out.println(shift.includesDate(new Date("1/9/2019")));
      System.out.println(shift.inWeek(new Week("35/2019")));
      System.out.println(shift.inWeek(new Week("36/2019")));
      System.out.println(shift.inWeek(new Week("37/2019")));
      System.out.println(Duration.format(shift.length(), "minute"));
      }
   }
   
 