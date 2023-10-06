import java.util.Objects;

public class Square extends Rectangle {

    /**
     * Square Constructor 1.
     */
    public Square() {

    }

    /**
     * Square Constructor 2.
     * @param side : double.
     */
    public Square(double side) {
        super(side, side);
    }


    /**
     * Square Constructor 3.
     * @param side : double.
     * @param color : String.
     * @param filled : boolean.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor 4.
     * @param color : String.
     * @param filled : boolean.
     * @param side : double.
     * @param topLeft : Point.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * getSide.
     * @return width : double.
     */
    public double getSide() {
        return width;
    }

    /**
     * setSide.
     * @param side : double.
     */
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    /**
     * Override setWidth.
     * @param side : double.
     */
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    /**
     * setLength.
     * @param side : double.
     */
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    /**
     * toString.
     * @return : String.
     */
    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft.toString()
                + ",side=" + (double) Math.round(getSide() * 10) / 10
                + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square obj = (Square) o;
            return topLeft.equals(obj.topLeft)
                    && getSide() == obj.getSide();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, getSide());
    }

    @Override
    public String getType() {
        return "Square";
    }
}
