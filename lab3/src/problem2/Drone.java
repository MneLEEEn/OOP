package problem2;

public class Drone implements Flyable {
    private int currentX;
    private int currentY;
    private int currentAltitude;

    public Drone(int startX, int startY) {
        this.currentX = startX;
        this.currentY = startY;
        this.currentAltitude = 0; 
        System.out.println("Drone initialized at (" + startX + ", " + startY + ")");
    }

    
    @Override
    public void move(int x, int y) {
        System.out.println("Drone flying from (" + currentX + ", " + currentY + ") to (" + x + ", " + y + ")");
        this.currentX = x;
        this.currentY = y;
        System.out.println("Drone's new coordinates are (" + currentX + ", " + currentY + ")");
    }


    @Override
    public void changeAltitude(int altitude) {
        System.out.println("Drone changing altitude from " + currentAltitude + "m to " + altitude + "m.");
        this.currentAltitude = altitude;
        System.out.println("Drone is now at " + currentAltitude + "m.");
    }
}
