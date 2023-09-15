public class TimePeriod {
    private Duration lowerBound;
    private Duration upperBound;
    
    public TimePeriod(Duration lowerBound, Duration upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    
    public Duration lowerBound(){
        return this.lowerBound;
    }
    
    public Duration upperBound(){
        return this.upperBound;
    }
    
    public boolean includes(Duration duration){
// this.lowerBound <= duration < this.upperBound;
        return (this.lowerBound().compareTo(duration) <= 0 && this.upperBound().compareTo(duration) > 0);
    }    
           
    public boolean precedes(TimePeriod other){
//         return this.upperBound <= other.lowerBound();
        return (this.upperBound().compareTo(other.lowerBound()) <= 0);
    }
    
    public boolean adjacent(TimePeriod other){
//        return this.lowerBound other
        return (this.upperBound().compareTo(other.lowerBound()) == 0 || this.lowerBound().compareTo(other.upperBound()) == 0); 
    }
    
    public String toString(){
        return String.format("[%s .. %s]", Duration.format(this.lowerBound(), "minute"), Duration.format(this.upperBound(), "minute"));
    }
}