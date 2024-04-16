
abstract class Shape {
  private String color;
  
  public abstract double Area();

  public void setColor(String input) {
    color = input;
  }

  public String getColor() {
    return color;
  }

}
