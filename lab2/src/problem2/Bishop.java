package problem2;

public class Bishop extends Piece {
    public Bishop(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        return Math.abs(a.x - b.x) == Math.abs(a.y - b.y) && a.x != b.x;
    }
}