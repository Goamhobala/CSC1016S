public class VLine extends VectorObject{
    private int length;
    
    public VLine(int id, int x, int y, int length){
        super(id, x, y);
        this.length = length;
    }
    
    @Override   
    public void draw(char [] [] matrix){
        for (int i = super.y; i < super.y + this.length; i++){
           matrix[i][super.x] = '*';
        }
    } 
}