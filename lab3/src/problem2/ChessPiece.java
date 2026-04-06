package problem2;

public class ChessPiece implements Moveable {
    private String type;
    private int currentX;
    private int currentY;

    public ChessPiece(String type, int startX, int startY) {
        this.type = type;
        this.currentX = startX;
        this.currentY = startY;
        System.out.println(type + " created at (" + startX + ", " + startY + ")");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving " + type + " from (" + currentX + ", " + currentY + ") to (" + x + ", " + y + ")");
        this.currentX = x;
        this.currentY = y;
        System.out.println(type + "'s new position is (" + currentX + ", " + currentY + ")");
    }
}
