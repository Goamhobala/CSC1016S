public class TestTariffTable{
   public static void main(String[] args){
      final Currency currency = new Currency("R", "ZAR", 100);
      final TimePeriod pOne = new TimePeriod(new Duration("hour", 1), new Duration("hour", 2));
      final TimePeriod pTwo = new TimePeriod(new Duration("hour", 2), new Duration("hour", 3));
      final TariffTable tariffTable = new TariffTable(2); tariffTable.addTariff(pOne, new Money("R2", currency)); tariffTable.addTariff(pTwo, new Money("R5", currency));
      System.out.println(tariffTable);
      System.out.println(tariffTable.getTariff(new Duration("minute", 65)));
      System.out.println(tariffTable.getTariff(new Duration("hour", 2)));
      }
   }