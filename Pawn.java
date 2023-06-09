public class Pawn extends Piece {
    private boolean isFirstMove;

    public Pawn (int xPos, int yPos, boolean isWhite, String visual) {
        super(xPos, yPos, isWhite, visual);
        this.isFirstMove = true;
    }

    public boolean canMove() {
        return true;
    }

    public boolean isAlive() {
        return true;
    }
}
