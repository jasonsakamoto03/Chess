public class Queen extends Piece {

    public Queen (int xPos, int yPos, boolean isWhite, String visual) {
        super(xPos, yPos, isWhite, visual);
    }

    public boolean canMove() {
        return true;
    }

    public boolean isAlive() {
        return true;
    }
}
