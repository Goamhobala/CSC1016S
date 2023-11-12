// Point line implementation class 
// Catherine Li
// LXXCAT004
// 26 September 2023

public class Catherine extends VectorObject{
   private int x1;
   private int y1;
   
   public Catherine( int anId, int ax, int ay, int x, int y)
   {
      super(anId, ax, ay);
      x1 = x;
      y1 = y;
   }
   
   public int getId ()
   {
      return id;
   }
   
   public void setNewCoords ( int newx, int newy )
   {
      x = newx;
      y = newy;
   } 
   
   public void draw ( char [][] matrix ){
      int x0 = x;
      int y0 = y;
      int x2 = x1;
      int y2 = y1;
      
      boolean steep = (Math.abs(y2-y0) > Math.abs(x2-x0)); // check if the gradient is not -1<=m<=1
      if (steep){
         //swap(x0,y0)
         int temp1 = x0;
         x0 = y0;
         y0 = temp1;
         
         //swap(x2,y2)
         int temp2 = x2;
         x2 = y2;
         y2 = temp2;
      }
      
      if (x0 > x2){ 
      // if delta x is negative (so later you can draw the line from right to left in the for loop)
         //swap(x0,x2)
         int temp3 = x0;
         x0 = x2;
         x2 = temp3;
         
         //swap(y0,y2)
         int temp4 = y0;
         y0 = y2;
         y2 = temp4;
      }
      
      int ys = (y0<y2) ? 1:-1; // y-slope is 1 if y is shorter than y_length
      double m = (double)Math.abs(y2-y0)/(double)(x2-x0); // Gradient mistake: making error and m int instead of double
      int yCo = y0; // y-coordinate stays fixed until gradient accumulates above 0.5
      double error = 0;
      
      for( int xCo = x0; xCo <= x2; xCo++){
         if (steep){
            matrix[xCo][yCo] = '*'; // here xCo techically is the original y cooridnate, we just swapped it previously
         }
         else{
            matrix[yCo][xCo] = '*';
         }
         
         error += m;
         
         if (error> 0.5){ // so you can round up
            yCo += ys;
            error = error-1; 
         }
      }

   }   

}