package problem2;

public class Knight extends Piece {
    public Knight(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
