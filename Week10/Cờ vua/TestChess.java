public class TestChess {
  public static void main(String[] args) {
    Piece rookWhite = new Rook(2, 1, "white");
    Piece rookBlack = new Rook(2, 6, "black");

    Board board = new Board();
    Game game = new Game(board);

    board.addPiece(rookWhite);
    board.addPiece(rookBlack);

    game.movePiece(rookWhite, 2, 6);
    System.out.println(game.getMoveHistory().size());

  }
}