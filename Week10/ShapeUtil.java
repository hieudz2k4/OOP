import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /**
     * print info.
     * @param shapes : List.
     * @return : String.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String res = "Circle:" + "\n";
        List<Circle> circles = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();

        for (GeometricObject geometricObject : shapes) {
            if (geometricObject instanceof Circle) {
                circles.add((Circle) geometricObject);
            } else {
                triangles.add((Triangle) geometricObject);
            }
        }

        for (Circle circle : circles) {
            res += circle.getInfo() + "\n";
        }

        res += "Triangle:" + "\n";

        for (Triangle triangle : triangles) {
            res += triangle.getInfo() + "\n";
        }

        return res;
    }
}
