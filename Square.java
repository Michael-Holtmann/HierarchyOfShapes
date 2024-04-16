
public class Square extends Rectangle {

  public Square(String c) {
    super();
    setColor(c);
    
  }

  public Square(double w, String c) {
    super(w, w);
    setColor(c);

  }

  public void setWidth(double w) {
    super.setWidth(w);
    setLength(w);
  }

  public double getWidth() {
    return super.getWidth();
  }

  public double getArea() {
    return super.getArea();
  }

  public String toString() {
    return String.format("%s Square size=(%.2f by .2f)", getColor(), getWidth(), getWidth());
  }
}