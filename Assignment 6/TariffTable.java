public class TariffTable{
   private ParkingTariff[] parkingTariffs;
   private int nextFree;
   
   public TariffTable(int maxSize){
      parkingTariffs = new ParkingTariff[maxSize];
      this.nextFree = 0;
      }
    
   public void addTariff(TimePeriod period, Money tariff){
      if (this.nextFree == 0 || (this.parkingTariffs[nextFree - 1].getTimeStayed().precedes(period) && this.parkingTariffs[nextFree - 1].getTimeStayed().adjacent(period))){
         this.parkingTariffs[nextFree] = new ParkingTariff(period, tariff);
         nextFree++;
         }
      else{
         throw new IllegalArgumentException("Tariff periods must be adjacent.");
         }
        
      }
    
   public Money getTariff(Duration lengthOfStay){
      for (ParkingTariff tariff: this.parkingTariffs){
         if (tariff.getTimeStayed().includes(lengthOfStay)){
            return tariff.getPrice();
            }
         }
       return null;
      }
    
   public String toString(){
      String outputString = "";
      for (int i = 0; i < this.nextFree ; i++){
         outputString += parkingTariffs[i].toString();
         if (i != this.nextFree -1){
            outputString += "\n";
            }
         }
      return outputString; 
      }
    
   }