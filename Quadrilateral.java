
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
  private int cornerAngle1;
  private int cornerAngle2;
  private int cornerAngle3;
  private int cornerAngle4;

  public Quadrilateral() {
    super(4, null);
    width = 0;
    length = 0;
    cornerAngle1 = 0;
    cornerAngle2 = 0;
    cornerAngle3 = 0;
    cornerAngle4 = 0;

  }

  public Quadrilateral(String color, int a, int b, int c, int d, int e, inf f) {
    super(4, color);
    width = a;
    length = b;
    cornerAngle1 = c;
    cornerAngle2 = d;
    cornerAngle3 = e;
    cornerAngle4 = f;
  }

  public int getSides() {
    return super.getSides();
  }

  public void setColor(String color) {
    super.setColor(color);
  }

  public String getColor() {
    return super.getColor();
  }

  public boolean isLegal() {
    return true;
  }

}
