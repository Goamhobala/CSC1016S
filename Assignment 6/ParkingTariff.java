public class ParkingTariff{
    private Money price;
    private TimePeriod timeStayed;
    
    public ParkingTariff(){
        TimePeriod defaultTime = new TimePeriod(new Duration("minute", 0), new Duration("minute", 30));
        Money defaultPrice = new Money("R10", new Currency("R", "ZAR", 100));
    }
    
    public ParkingTariff(TimePeriod timeStayed, Money price){
        this.price = price;
        this.timeStayed = timeStayed;
    }
    
    public Money getPrice(){
        return this.price;
    }
    
    public TimePeriod getTimeStayed(){
        return this.timeStayed;
    }
    
    public void setPrice(Money newPrice){
        this.price = newPrice;
    }
    
    public void setTimeStayed(TimePeriod newTimeStayed){
        this.timeStayed = newTimeStayed;
    }
    
    public String toString(){
        return String.format("%s : %s", this.timeStayed.toString(), this.price.toString());
    }
}