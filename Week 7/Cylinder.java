public class Cylinder extends Circle {
    private double height; // height

    /**
     * Cylinder.
     */
    public Cylinder() {

    }

    /**
     * Cylinder(double height).
     * @param height : height of Cylinder.
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Cylinder(double radius, double height).
     * @param radius : double.
     * @param height : double.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Cylinder(double radius, String color, double height).
     * @param radius : double.
     * @param color : String.
     * @param height : double.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * get height.
     * @return double.
     */
    public double getHeight() {
        return height;
    }

    /**
     * set height.
     * @param height : double.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * get volume.
     * @return double.
     */
    public double getVolume() {
        return height * super.getArea();
    }

    /**
     * toString method.
     * @return String.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    /**
     * get area.
     * @return double.
     */
    @Override
    public double getArea() {
        return 2 * PI * getRadius() * height + 2 * super.getArea();
    }
}
