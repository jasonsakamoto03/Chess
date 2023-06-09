public class Knight extends Piece {

    public Knight (int xPos, int yPos, boolean isWhite, String visual) {
        super(xPos, yPos, isWhite, visual);
    }

    public boolean canMove() {
        return true;
    }

    public boolean isAlive() {
        return true;
    }
}
