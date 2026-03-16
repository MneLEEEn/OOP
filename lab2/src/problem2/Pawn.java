package problem2;

public class Pawn extends Piece {
    public Pawn(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = a.x - b.x;
        int dy = b.y - a.y; 

       
        return (dx == 0 && dy == 1);
      
    }
}
