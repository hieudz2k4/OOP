public abstract class Shape {
    protected String color; // color
    protected boolean filled; // filled

    /**
     * Shape Constructor 1.
     */
    public Shape() {

    }

    /**
     * Shape Constructor 2.
     * @param color : String.
     * @param filled : boolean.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // getArea
    public abstract double getArea();

    // getPerimeter
    public abstract double getPerimeter();

    // toString
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }

    // getType
    public String getType() {
        return "Shape";
    }

}
