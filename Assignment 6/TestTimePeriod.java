public class TestTimePeriod{
    public static void main(String[] args){
    final TimePeriod pOne = new TimePeriod(new Duration("hour", 1), new
    Duration("hour", 2));
    final TimePeriod pTwo = new TimePeriod(new Duration("hour", 2), new
    Duration("hour", 3));
    final TimePeriod pThree = new TimePeriod(new Duration("hour", 3),
    new Duration("hour", 4));
    System.out.printf("%s\n%s\n%s\n",pOne, pTwo, pThree);
    }
}