import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>(); // ArrayList<Shape>

    /**
     * Constructor1.
     */
    public Layer() {
    }

    /**
     * addShape method.
     * @param shape : Shape.
     */
    public void addShape(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    /**
     * removeCircles method.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * getInfo method.
     * @return String.
     */
    public String getInfo() {
        String res = "Layer of crazy shapes:";
        for (Shape shape : shapes) {
            if (shape != null) {
                switch (shape.getType()) {
                    case "Circle":
                        shape = (Circle) shape;
                        res += "\n" + shape.toString();
                        break;
                    case "Rectangle":
                        shape = (Rectangle) shape;
                        res += "\n" + shape.toString();
                        break;
                    case "Square":
                        shape = (Square) shape;
                        res += "\n" + shape.toString();
                        break;
                    default:
                        break;
                }
            }
        }
        return res;
    }

    /**
     * removeDuplicates.
     */
    public void removeDuplicates() {
        LinkedHashSet<Shape> shapeRemoveDuplicates = new LinkedHashSet<Shape>(); //  hash set
        for (Shape shape : shapes) {
            shapeRemoveDuplicates.add(shape);
        }
        shapes.clear(); // clear all element in shapes
        for (Shape shape : shapeRemoveDuplicates) {
            shapes.add(shape);
        }
    }
}
