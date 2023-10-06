public class TestPolymorphism {
	public static void main(String[] args) {
		Point point = new Point(10.0, 5.0); // point
		Circle circle = new Circle(point, 8.0, "RED", true); // circle
		Rectangle rectangle = new Rectangle(point, 8.0, 6.0, "RED", true); // rectangle
		Square square = new Square(point, 8.0, "RED", true); // square
		Shape shape =  new Circle(); // circle
		Shape shape1 = new Rectangle(point, 8.0, 6.0, "BLUE", true); // rectangle
		Shape shape2 =  new Square(point, 8.0, "RED", true); // square
		Layer layer = new Layer();

		layer.addShape(circle);
		layer.addShape(rectangle);
		layer.addShape(square);
		layer.addShape(shape1);
		layer.addShape(shape2);

		layer.removeDuplicates();
		System.out.println(layer.getInfo());
	}
}