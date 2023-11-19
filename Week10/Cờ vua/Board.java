import java.util.ArrayList;

public class Board {
  public static final int WIDTH = 8;
  public static final int HEIGHT = 8;
  private ArrayList<Piece> pieces = new ArrayList<>();

  public Board() {
  }

  /**
   * addpiece.
   * param piece: Piece.
   */
  public void addPiece(Piece piece) {
    if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
      for (Piece piece1 : pieces) {
        if (piece1.checkPosition(piece)) {
          return;
        }
      }
      pieces.add(piece);
    } else {
      return;
    }
  }

  /** validate. */
  public boolean validate(int x, int y) {
    return (x >= 1 && x <= 8) && (y >= 1 && y <= 8);
  }

  /**
   * reomoveAt.
   * @param x : int.
   * @param y : int.
   */
  public void removeAt(int x, int y) {
    for (Piece piece : pieces) {
      if (piece.getCoordinatesX() == x
          && piece.getCoordinatesY() == y) {
        pieces.remove(piece);
        return;
      }
    }
  }

  /**
   * getAt.
   * @param x : int.
   * @param y : int.
   * @return Piece.
   */
  public Piece getAt(int x, int y) {
    for (Piece piece : pieces) {
      if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
        return piece;
      }
    }
    return null;
  }

  public ArrayList<Piece> getPieces() {
    return pieces;
  }

  public void setPieces(ArrayList<Piece> pieces) {
    this.pieces = pieces;
  }
}
