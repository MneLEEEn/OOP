package problem3;

public class Main {
    public static void main(String[] args) {

        App app = new App();

        Game logic = new LogicGame();
        Game memory = new MemoryGame();

        System.out.println("Logic Game:");
        app.getStatistics(logic);

        System.out.println("\nMemory Game:");
        app.getStatistics(memory);

        iPhone phone = new iPhone();
        phone.sell();
        phone.plugIn();
    }
}