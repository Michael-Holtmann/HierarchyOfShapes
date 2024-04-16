
public class Rectangle extends Parallelogram

{
    private double l;
    private double w;

    public Rectangle()                     { l=0; w=0; setColor("Blue");  }
    public Rectangle(double l, double w)   { this.l = l; this.w = w; setColor("Blue");}
    public void   setWidth( double w)      { this.w = w;     }
    public void   setLength( double l1)    { this.l = l;     }
    public double getWidth()               { return w;  }
    public double getLength()              { return l; }
    public double getArea()                { return l*w; }

    public String toString() 
    { return String.format("%s Rectangle size=(%.2f by %.2f)", super.getColor(), l, w); }
}