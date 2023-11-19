public abstract class Piece {
  private int coordinatesX;
  private int coordinatesY;
  private String color;

  /**
   * Piece.
   * @param coordinatesX : int.
   * @param coordinatesY : int.
   */
  public Piece(int coordinatesX, int coordinatesY) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
    color = "white";
  }

  /**
   * Piece.
   * @param coordinatesX : int.
   * @param coordinatesY : int.
   * @param color : String.
   */
  public Piece(int coordinatesX, int coordinatesY, String color) {
    this.coordinatesX = coordinatesX;
    this.coordinatesY = coordinatesY;
    this.color = color;
  }

  public abstract String getSymbol();

  public abstract boolean canMove(Board board, int x, int y);

  public int getCoordinatesX() {
    return coordinatesX;
  }

  public int getCoordinatesY() {
    return coordinatesY;
  }

  public String getColor() {
    return color;
  }

  public void setCoordinatesX(int coordinatesX) {
    this.coordinatesX = coordinatesX;
  }

  public void setCoordinatesY(int coordinatesY) {
    this.coordinatesY = coordinatesY;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean checkPosition(Piece piece) {
    return piece.coordinatesX == coordinatesX && piece.coordinatesY == coordinatesY;
  }
}
