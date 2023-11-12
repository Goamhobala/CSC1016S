
public class HLine extends VectorObject{
    private int length;
    
    public HLine(int id, int x, int y, int length){
        super(id, x, y);
        this.length = length;
    }

@Override   
    public void draw(char [] [] matrix){
        for (int i = super.x; i < super.x + this.length; i++){
           matrix[super.y][i] = '*';
        }
    }
     
}
