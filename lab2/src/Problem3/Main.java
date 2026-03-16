package Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank myBank = new Bank();
        
        while (true) {
            System.out.println("\n=== МЕНЮ БАНКА ===");
            System.out.println("1. Открыть Savings Account");
            System.out.println("2. Открыть Checking Account");
            System.out.println("3. Положить деньги (Deposit)");
            System.out.println("4. Снять деньги (Withdraw)");
            System.out.println("5. Перевод (Transfer)");
            System.out.println("6. Обновить банк (Проценты/Комиссии)");
            System.out.println("7. Показать все счета");
            System.out.println("0. Выход");
            System.out.print("Выберите опцию: ");
            
            int choice = sc.nextInt();
            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.print("Номер счета: ");
                    int sNum = sc.nextInt();
                    System.out.print("Процентная ставка (%): ");
                    double rate = sc.nextDouble();
                    myBank.openAccount(new SavingsAccount(sNum, rate));
                    break;

                case 2:
                    System.out.print("Номер счета: ");
                    int cNum = sc.nextInt();
                    myBank.openAccount(new CheckingAccount(cNum));
                    break;

                case 3:
                    System.out.print("Введите номер счета: ");
                    Account accDep = myBank.findAccount(sc.nextInt());
                    if (accDep != null) {
                        System.out.print("Сумма депозита: ");
                        accDep.deposit(sc.nextDouble());
                        System.out.println("Готово.");
                    } else System.out.println("Счет не найден!");
                    break;

                case 4:
                    System.out.print("Введите номер счета: ");
                    Account accWith = myBank.findAccount(sc.nextInt());
                    if (accWith != null) {
                        System.out.print("Сумма снятия: ");
                        accWith.withdraw(sc.nextDouble());
                        System.out.println("Готово.");
                    } else System.out.println("Счет не найден!");
                    break;

                case 5:
                    System.out.print("Откуда (номер): ");
                    Account from = myBank.findAccount(sc.nextInt());
                    System.out.print("Куда (номер): ");
                    Account to = myBank.findAccount(sc.nextInt());
                    if (from != null && to != null) {
                        System.out.print("Сумма перевода: ");
                        from.transfer(sc.nextDouble(), to);
                    } else System.out.println("Один из счетов не найден!");
                    break;

                case 6:
                    myBank.update();
                    System.out.println("Все счета обновлены.");
                    break;

                case 7:
                    myBank.displayAccounts();
                    break;
            }
        }
        sc.close();
    }
}
