package problem4;

import java.util.Scanner;

public class CircuitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Настройка электрической цепи (Figure 1) ===");

     
        System.out.print("Введите сопротивление R1 (Ом): ");
        double r1_val = sc.nextDouble();
        System.out.print("Введите сопротивление R2 (Ом): ");
        double r2_val = sc.nextDouble();
        System.out.print("Введите сопротивление R3 (Ом): ");
        double r3_val = sc.nextDouble();
        System.out.print("Введите сопротивление R4 (Ом): ");
        double r4_val = sc.nextDouble();

    
        Circuit r1 = new Resistor(r1_val);
        Circuit r2 = new Resistor(r2_val);
        Circuit r3 = new Resistor(r3_val);
        Circuit r4 = new Resistor(r4_val);

    
        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit finalCircuit = new Parallel(c1, c2);

    
        System.out.print("Введите входное напряжение V (Вольт): ");
        double voltage = sc.nextDouble();
        finalCircuit.applyPotentialDiff(voltage);

        System.out.println("\n--- Результаты анализа цепи ---");
        System.out.printf("Эквивалентное сопротивление: %.2f Ом\n", finalCircuit.getResistance());
        System.out.printf("Общая мощность системы: %.2f Вт\n", finalCircuit.getPower());
        System.out.printf("Общий ток в цепи: %.2f А\n", finalCircuit.getCurrent());

       
        System.out.println("\n--- Напряжение на компонентах ---");
        System.out.printf("Напряжение на R1 и R2 (параллельный узел): %.2f В\n", c1.getPotentialDiff());
        System.out.printf("Напряжение на R3: %.2f В\n", r3.getPotentialDiff());
        System.out.printf("Напряжение на R4: %.2f В\n", r4.getPotentialDiff());

        sc.close();
    }
}