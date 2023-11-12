public class Rectangle extends VectorObject{
    private int lengthX, lengthY;
    
    public Rectangle(int id, int x, int y, int lengthX, int lengthY){
        super(id, x, y);
        this.lengthX = lengthX;
        this.lengthY = lengthY;
    }
    
    @Override   
    public void draw(char [] [] matrix){
        for (int i = super.y;  i < super.y + lengthY; i++){
            HLine hl = new HLine(i, super.x, i, lengthX);
            hl.draw(matrix);
        }
    } 
}