public class Polygons extends Shape
{
    private int sides;
    private String color;
    
    
    public Polygons(){
        sides = 0;
        color = null;
    }
    public Polygons(int a, String b){
        sides = a;
        color = b;
    }
    
    public void setSides(int a) {
        sides = a;
    }
    
    public int getSides(){
        return sides;
    }
    
    public void setColor(String a) {
        color = a;
    }
    
    public String getColor(){
        return color;
    }

  
    
}
