package lab1;

public class main {
    public static void main(String[] args) {
        // Создаем первый заказ (используем перегруженный конструктор без параметров)
        // Он внутри вызовет this(CoffeeSize.MEDIUM)
        CoffeeOrder order1 = new CoffeeOrder();
        order1.addExtra("Sugar");
        
        System.out.println("Order 1 ID: " + order1.getOrderId()); // Выведет 1

        // Создаем второй заказ (явно указываем размер)
        CoffeeOrder order2 = new CoffeeOrder(CoffeeSize.LARGE);
        order2.addExtra("Syrup", 2); // Используем перегруженный метод с количеством
        
        System.out.println("Order 2 ID: " + order2.getOrderId()); // Выведет 2

        // Проверяем статический метод
        System.out.println("Total orders created: " + CoffeeOrder.getTotalOrders()); // Выведет 2
    }
}