import java.util.Objects;

public class Point {
    private double pointX; // x
    private double pointY; // y

    /**
     * Constructor 1.
     * @param pointX : double.
     * @param pointY : double.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     * @param newPoint : Point.
     * @return : double.
     */
    public double distance(Point newPoint) {
        double distanceX = pointX - newPoint.getPointX();
        double distanceY = pointY - newPoint.getPointY();
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    /**
     * equals.
     * @param o : Object.
     * @return boolean.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point obj = (Point) o;
            if (Math.abs(pointX - obj.getPointX()) <= 0.001
                    && Math.abs(pointY - obj.getPointY()) <= 0.001) {
                return true;
            }
        }
        return false;
    }

    /**
     * Hash code override.
     * @return hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * toString override.
     * @return String.
     */
    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
