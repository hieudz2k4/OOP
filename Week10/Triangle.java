public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor Triangle.
     * @param p1 : Point.
     * @param p2 : Point.
     * @param p3 : Point.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        if (p1.distance(p2) == 0
                || p2.distance(p3) == 0
                || p3.distance(p1) == 0
                || p1.checkAlign(p2, p3)) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        double halfPeri = getPerimeter() / 2;
        // su dung cong thuc: S = sqrt(p*(p-a)*(p-b)*(p-c))
        return Math.sqrt(halfPeri
                * (halfPeri - p1.distance(p2))
                * (halfPeri - p2.distance(p3))
                * (halfPeri - p3.distance(p1)));
    }

    @Override
    public double getPerimeter() {
        double distance12 = p1.distance(p2);
        double distance23 = p2.distance(p3);
        double distance31 = p3.distance(p1);
        return distance12
                + distance23
                + distance31;
    }

    @Override
    public String getInfo() {
        return "Triangle[(" + String.format("%.2f", p1.getPointX()) + ","
                + String.format("%.2f", p1.getPointY()) + "),("
                + String.format("%.2f", p2.getPointX()) + ","
                + String.format("%.2f", p2.getPointY()) + "),("
                + String.format("%.2f", p3.getPointX()) + ","
                + String.format("%.2f", p3.getPointY()) + ")]";
    }
}
