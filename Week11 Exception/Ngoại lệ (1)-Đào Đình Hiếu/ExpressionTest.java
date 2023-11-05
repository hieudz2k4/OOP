public class ExpressionTest {
    /**
     * main.
     * param args: String[].
     */
    public static void main(String[] args) {
        Expression expression = new Square(
                new Addition(
                        new Subtraction(
                                new Square(new Numeral(10)), new Numeral(3)), new Multiplication(
                                        new Numeral(4), new Numeral(3))));

        System.out.println(expression.toString());
        System.out.println(expression.evaluate());

        expression =  new Division(expression, new Numeral(0));
        System.out.println(expression.toString());
        System.out.println(expression.evaluate());
    }
}
