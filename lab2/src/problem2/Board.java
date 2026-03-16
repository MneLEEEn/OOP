package problem2;

public class Board {
    private Piece[][] grid;

    public Board() {
        grid = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
       
        grid[0][0] = new Rook(new Position(0, 0));
        grid[7][0] = new Rook(new Position(7, 0));
     
    }

    public boolean movePiece(int fromX, int fromY, int toX, int toY) {
        Piece p = grid[fromX][fromY];
        if (p == null) return false; 

        Position target = new Position(toX, toY);
        if (p.isLegalMove(target)) {
            grid[toX][toY] = p;    
            grid[fromX][fromY] = null; 
            p.a = target;           
            return true;
        }
        return false;
    }

    public void drawBoard() {
        for (int y = 7; y >= 0; y--) {
            for (int x = 0; x < 8; x++) {
                if (grid[x][y] == null) System.out.print(". ");
                else System.out.print(grid[x][y].getClass().getSimpleName().charAt(0) + " ");
            }
            System.out.println();
        }
    }
}
