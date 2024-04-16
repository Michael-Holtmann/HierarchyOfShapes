
/**
 * Write a description of class Quadrilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quadrilateral extends Polygons

{
    private int width;
    private int length;
    private int cornerAngle;
    
    
    public Quadrilateral(){
        super(4, null);
        width = 0;
        length = 0;
        cornerAngle = 90; 
    }
    public Quadrilateral( String color, int a, int b, int c){
        super(4, color);
        width = a;
        length = b;
        cornerAngle = c;
    }
    
    public int getSides(){
        return super.getSides();
    }
    public void setColor(String color){
        super.setColor(color);
    }
    public String getColor(){
        return super.getColor();
    }
    
}
