// By: Jason Sakamoto
// Date: 4/25/2023
// Interface for a piece in a game of chess
import java.util.*;

public abstract class Piece {
    private int xPos;
    private int yPos;
    private boolean isWhite;
    private String visual;

    public Piece (int xPos, int yPos, boolean isWhite, String visual) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.isWhite = isWhite;
        this.visual = visual;
    }

    public abstract boolean canMove();

    public abstract boolean isAlive();

    public String getVisual() {
        return visual;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }
}
