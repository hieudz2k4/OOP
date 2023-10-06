import java.util.Objects;

public class Circle extends Shape {
    protected double radius; // radius
    protected Point center; // center

    /**
     * Circle Constructor 1.
     */
    public Circle() {

    }

    /**
     * Circle Constructor 2.
     * @param radius : double.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circle Constructor 3.
     * @param radius : double.
     * @param color : String.
     * @param filled : boolean.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Circle Constructor 4.
     * @param color : String.
     * @param filled : boolean.
     */
    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    /**
     * Constructor 5.
     * @param center : Point.
     * @param radius : double.
     * @param color : String.
     * @param filled : boolean.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /**
     * Constructor 6.
     * @param radius : double.
     * @param center : Point,
     */
    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius="
                + (double) Math.round(radius * 10) / 10
                + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle obj = (Circle) o;
            Point centerObj = obj.center;
            return center.equals(centerObj)
                    && radius == obj.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
