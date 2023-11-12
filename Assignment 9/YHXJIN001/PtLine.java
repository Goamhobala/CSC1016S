import java.lang.Math;
public class PtLine extends VectorObject{
    private int bx, by;
    
    public PtLine(int id, int x, int y, int bx, int by){
        super(id, x, y);
        this.bx = bx;
        this.by = by;
    }

@Override   
    public void draw(char [] [] matrix){
        int temp;
        int x0 = super.x;
        int x1 = this.bx;
        int y0 = super.y;
        int y1 = this.by;
        boolean steep = Math.abs(y0 - y1) > Math.abs(x0 - x1);
        if (steep){
            temp = x0;
            x0 = y0;
            y0 = temp;
            temp = x1;
            x1 = y1;
            y1 = temp;
        }
        if (x0 > x1){
            temp = x0;
            x0 = x1;
            x1 = temp;
            temp = y0;
            y0 = y1;
            y1 = temp;
        }
        int ys = (y0 < y1) ? 1 : -1;
        double m = (double) Math.abs(y1 - y0)/(double)(x1 - x0);
        int _y = y0;
        double error = 0;

        for (int _x = x0; _x <= x1; _x++){
            
            if (steep){
                matrix[_x][_y] = '*';
            }
            else{
                matrix[_y][_x] = '*';
            }
            error += m;
            if (error > 0.5){
                _y += ys;
                error -= 1;
            }
        }

        }
     
}
