public class Rectangle {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException();
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public String toString() {
        return "Width: " + this.width + " height: " + this.height + " Area: " + getArea();
    }

    public static String getName(){
      return  "Rectangle";
    }
}
