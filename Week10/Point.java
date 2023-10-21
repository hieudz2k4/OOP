public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     * @param other : Point.
     * @return : double.
     */
    public double distance(Point other) {
        double distancePowTwo = Math.pow(pointX - other.pointX, 2)
                                + Math.pow(pointY - other.pointY, 2);
        return Math.sqrt(distancePowTwo);
    }

    /**
     * check align.
     * @param other1 : Point.
     * @param other2 : Point.
     * @return : boolean.
     */
    public boolean checkAlign(Point other1, Point other2) {
        double a = (other1.pointY - other2.pointY)
                / (other1.pointX - other2.pointX);
        double b = other1.pointY - a * other1.pointX;

        return pointY == a * pointX + b;
    }
}
