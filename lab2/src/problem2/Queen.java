package problem2;

public class Queen extends Piece {
    public Queen(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return (a.x == b.x || a.y == b.y) || (dx == dy);
    }
}