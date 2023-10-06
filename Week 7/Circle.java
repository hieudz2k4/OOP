public class Circle {
    private double radius; // radius
    private String color; // color
    protected static final double PI = 3.14; // PI

    /**
     * Circle().
     */
    public Circle() {

    }

    /**
     * Circle(double radius).
     * @param radius : radius of circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circle(double radius, String color).
     * @param radius : radius of circle.
     * @param color : color of circle
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * get radius.
     * @return double.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set radius.
     * @param radius : radius of circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get color.
     * @return String.
     */
    public String getColor() {
        return color;
    }

    /**
     * set color.
     * @param color : color of circle.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * get area.
     * @return double.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * toString method.
     * @return String.
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
