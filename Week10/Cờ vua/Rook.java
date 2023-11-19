import java.util.ArrayList;

public class Rook extends Piece {

  public Rook(int coordinatesX, int coordinatesY) {
    super(coordinatesX, coordinatesY);
  }

  public Rook(int coordinatesX, int coordinatesY, String color) {
    super(coordinatesX, coordinatesY, color);
  }

  /**
   * getSymbol.
   * @return : String.
   */
  @Override
  public String getSymbol() {
    return "R";
  }

  /**
   * canMove.
   * @param board : Board.
   * @param x : int.
   * @param y : int.
   * @return : boolean.
   */
  @Override
  public boolean canMove(Board board, int x, int y) {
    if (x != this.getCoordinatesX() && y != this.getCoordinatesY()) {
      return false;
    }

    ArrayList<Piece> piecesX = new ArrayList<>();
    ArrayList<Piece> piecesY = new ArrayList<>();

    for (int i = 1; i <= 8; i++) {
      if (i != this.getCoordinatesX()
          && board.getAt(i, y) != null) {
        piecesY.add(board.getAt(i, y));
      }

      if (i != this.getCoordinatesY() && board.getAt(x, i) != null) {
        piecesX.add(board.getAt(x, i));
      }
    }

    for (Piece piece : piecesY) {
      if ((this.getCoordinatesX()
          - piece.getCoordinatesX())
          * (x - piece.getCoordinatesX()) < 0) {
        return false;
      }
    }

    for (Piece piece : piecesX) {
      if ((this.getCoordinatesY()
          - piece.getCoordinatesY())
          * (y - piece.getCoordinatesY()) < 0) {
        return false;
      }
    }

    Piece des = board.getAt(x, y);
    return des == null
        || des.getColor()
        != this.getColor();
  }
}
