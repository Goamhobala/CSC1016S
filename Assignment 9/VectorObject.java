abstract class VectorObject
{
   protected int id, x, y;
   
   VectorObject ( int anId, int ax, int ay )
   {
      this.id = anId;
      this.x = ax;
      this.y = ay;
   }
   
   int getId ()
   {
      return id;
   }
   
   void setNewCoords ( int newx, int newy )
   {
      x = newx;
      y = newy;
   }
   
   public abstract void draw ( char [][] matrix );
}
