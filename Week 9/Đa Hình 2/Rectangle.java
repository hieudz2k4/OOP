import java.util.Objects;

public class Rectangle extends Shape {
    protected double width; // width
    protected double length; // length
    protected Point topLeft; // topLeft

    /**
     * Rectangle Constructor 1.
     */
    public Rectangle() {

    }

    /**
     * Rectangle Constructor 2.
     * @param width : double.
     * @param length : double.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Rectangle constructor 3.
     * @param width : double.
     * @param length : double.
     * @param color : String.
     * @param filled : boolean.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 4.
     * @param width : double.
     * @param length : double.
     * @param topLeft : Point.
     */
    public Rectangle(double width, double length, Point topLeft) {
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    /**
     * Contructor 5.
     * @param topLeft : Point.
     * @param width : double.
     * @param length : double.
     * @param color : String.
     * @param filled : boolean.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString()
                + ",width=" + (double) Math.round(width * 10) / 10
                + ",length=" + (double) Math.round(length * 10) / 10
                + ",color=" + color
                + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle obj = (Rectangle) o;
            Point topLeftRec = (Point) obj.topLeft;
            return topLeftRec.equals(topLeft)
                    && width == obj.getWidth()
                    && length ==  obj.getLength();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
