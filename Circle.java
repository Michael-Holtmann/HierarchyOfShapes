
public class Circle extends Shape
{
    private double r;
   

    public Circle(String c)             { setColor(c); r=0;  }
    public Circle(double r1, String c)  { setColor(c); r = r1;}
    public void   setRadius( double r1) { r = r1;    }
    public double getRadius()           { return r;  }
    public double getArea()             { return Math.PI*r*r; }

    public String toString() 
    { return String.format("%s Circle: r=%.2f", getColor(), r); };
}