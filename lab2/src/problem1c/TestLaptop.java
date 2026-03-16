package problem1c;

import java.util.HashSet;

public class TestLaptop {

    public static void main(String[] args) {

        HashSet<Laptop> laptops = new HashSet<>();

        Laptop l1 = new Laptop("Mac", "Air");
        Laptop l2 = new Laptop("Mac", "Air"); 

        GamingLaptop g1 = new GamingLaptop("Asus", "TufGaming", "RTX 4060");
        GamingLaptop g2 = new GamingLaptop("Asus", "TufGaming", "RTX 4060"); 

        laptops.add(l1);
        laptops.add(l2);
        laptops.add(g1);
        laptops.add(g2);

        System.out.println("HashSet contents:");

        for (Laptop l : laptops) {
            System.out.println(l);
        }

        System.out.println("Total unique laptops: " + laptops.size());
    }
}