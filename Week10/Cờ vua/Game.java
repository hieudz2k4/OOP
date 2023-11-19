import java.util.ArrayList;

public class Game {
  private Board board;
  private ArrayList<Move> moveHistory = new ArrayList<>();

  public Game(Board board) {
    this.board = board;
  }

  public Board getBoard() {
    return board;
  }

  public ArrayList<Move> getMoveHistory() {
    return moveHistory;
  }

  public void setBoard(Board board) {
    this.board = board;
  }

  /**
   * movePiece.
   * @param piece : Piece.
   * @param x : int.
   * @param y : int.
   */
  public void movePiece(Piece piece, int x, int y) {
    if (piece.canMove(board, x, y)) {
      if (board.getAt(x, y) == null) {
        Move move = new Move(piece.getCoordinatesX(),
            piece.getCoordinatesY(),
            x,
            y,
            piece);
        moveHistory.add(move);
      } else {
        Move move = new Move(piece.getCoordinatesX(),
            piece.getCoordinatesY(),
            x,
            y,
            piece,
            board.getAt(x, y));
        moveHistory.add(move);
        board.removeAt(x, y);
      }

      piece.setCoordinatesX(x);
      piece.setCoordinatesY(y);
    }
  }
}
