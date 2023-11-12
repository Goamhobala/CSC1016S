import java.lang.Math;
public class CowsAndBulls{
   public final static int NUM_DIGITS = 4;
   public final static int MAX_VALUE = 9876;
   public final static int MIN_VALUE = 1234;
   public final static int MAX_GUESSES = 10;
   private int answer;
   private int guessesRemaining;
   private int cows;
   private int bulls;
   
   public CowsAndBulls(int seed){
      // Create a CowsAndBulls game using the given randomisation seed value to generate
      // a mystery number of NUM_DIGITS length, and that gives the player MAX_GUESSES guesses.
      
      this.answer = 0;
      this.guessesRemaining = MAX_GUESSES;
      
      // Required as per the assignment instruction
      NumberPicker n = new NumberPicker(seed, 1, 9);
      
      for (int i = 3; i>=0 ; i--){
         this.answer += n.nextInt() * (int)(Math.pow(10, i));
         }
      
      }
   
   public int guessesRemaining(){
      return this.guessesRemaining;
      }
   
   public Result guess(int guessNumber){
      this.bulls = NumberUtils.countMatches(this.answer, guessNumber);
   
      this.cows = NumberUtils.countIntersect(this.answer, guessNumber) - this.bulls;
      this.guessesRemaining -= 1;
      return new Result(this.cows, this.bulls);
      }
   
   public int giveUp(){
      this.guessesRemaining = 0;
      return answer;
      }
   
   public boolean gameOver(){
      return (guessesRemaining == 0 || this.bulls == 4);
      }
   }