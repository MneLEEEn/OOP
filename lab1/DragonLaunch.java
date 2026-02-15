package lab1;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> line = new Vector<>();

    // Дракон похищает студента
    public void kidnap(Person p) {
        line.add(p);
    }

    // Главный алгоритм
    public boolean willDragonEatOrNot() {
        int boysToMatch = 0;

        for (Person p : line) {
            if (p.getGender() == Gender.BOY) {
                // Если пришел мальчик, он ждет свою пару (девочку)
                boysToMatch++;
            } else {
                // Если пришла девочка:
                if (boysToMatch > 0) {
                    // Она образует пару с последним мальчиком в очереди, и они исчезают
                    boysToMatch--;
                } else {
                    // Если девочка пришла, а мальчиков впереди нет (например, "G..."), 
                    // она уже никогда не исчезнет.
                    return true; 
                }
            }
        }
        
        // Если после прохода всей очереди остались непарные мальчики — дракон поест
        return boysToMatch > 0;
    }

    public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();
        
        // Пример BBGG (никто не останется)
        dl.kidnap(new Person(Gender.BOY, "Ivan"));
        dl.kidnap(new Person(Gender.BOY, "Alex"));
        dl.kidnap(new Person(Gender.GIRL, "Maria"));
        dl.kidnap(new Person(Gender.GIRL, "Anna"));

        if (dl.willDragonEatOrNot()) {
            System.out.println("Dragon will have a lunch!");
        } else {
            System.out.println("No one left for the dragon.");
        }
    }
}