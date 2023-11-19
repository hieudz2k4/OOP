public class Move {
  private int startX;
  private int endX;
  private int startY;
  private int endY;
  private Piece movedPiece;
  private Piece killedPiece;

  /**
   * Move Constructor.
   * @param startX : int.
   * @param endX : int.
   * @param startY : int.
   * @param endY : int.
   * @param movedPiece : Piece.
   */
  public Move(int startX, int endX, int startY, int endY, Piece movedPiece) {
    this.startX = startX;
    this.endX = endX;
    this.startY = startY;
    this.endY = endY;
    this.movedPiece = movedPiece;
  }

  /**
   * Move Constructor.
   * @param startX : int.
   * @param endX : int.
   * @param startY : int.
   * @param endY : int.
   * @param movedPiece : Piece.
   * @param killedPiece : Piece.
   */
  public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
    this.startX = startX;
    this.endX = endX;
    this.startY = startY;
    this.endY = endY;
    this.movedPiece = movedPiece;
    this.killedPiece = killedPiece;
  }

  /**
   * toString.
   * @return : String.
   */
  public String toString() {
    return movedPiece.getColor() + "-"
        + movedPiece.getSymbol()
        + (char) (endX - 1 + 'a')
        + movedPiece.getCoordinatesY();
  }

  public int getStartX() {
    return startX;
  }

  public int getEndX() {
    return endX;
  }

  public int getStartY() {
    return startY;
  }

  public int getEndY() {
    return endY;
  }

  public Piece getMovedPiece() {
    return movedPiece;
  }

  public Piece getKilledPiece() {
    return killedPiece;
  }

  public void setStartX(int startX) {
    this.startX = startX;
  }

  public void setEndX(int endX) {
    this.endX = endX;
  }

  public void setStartY(int startY) {
    this.startY = startY;
  }

  public void setEndY(int endY) {
    this.endY = endY;
  }

  public void setMovedPiece(Piece movedPiece) {
    this.movedPiece = movedPiece;
  }

  public void setKilledPiece(Piece killedPiece) {
    this.killedPiece = killedPiece;
  }
}
