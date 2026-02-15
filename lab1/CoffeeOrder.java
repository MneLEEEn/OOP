package lab1;

//1. Использование Enum
enum CoffeeSize {
 SMALL, MEDIUM, LARGE
}

public class CoffeeOrder {
 // 2. final (нестатическое поле) — ID заказа не меняется
 private final int orderId;
 
 // 3. static (нефинальное поле) — общий счетчик для всех заказов
 private static int totalOrdersCreated = 0;
 
 // 4. Read-only поле (через final и отсутствие сеттера)
 private final CoffeeSize size;
 private double price;

 // 5. Блок инициализации (выполняется перед конструктором)
 {
     totalOrdersCreated++;
     System.out.println("Initializing new order...");
 }

 // 6. Использование "this" (1-й способ: для обращения к полям)
 public CoffeeOrder(CoffeeSize size) {
     this.orderId = totalOrdersCreated;
     this.size = size;
     this.price = 5.0; // Базовая цена
 }

 // 7. Перегрузка методов (Method Overloading) + "this" (2-й способ: вызов конструктора)
 public CoffeeOrder() {
     this(CoffeeSize.MEDIUM); // Вызывает конструктор выше
 }

 // 8. Перегрузка метода для добавления топпинга
 public void addExtra(String topping) {
     this.price += 1.0;
     System.out.println("Added: " + topping);
 }

 public void addExtra(String topping, int quantity) {
     this.price += (1.0 * quantity);
     System.out.println("Added: " + topping + " x" + quantity);
 }

 // 9. Static метод
 public static int getTotalOrders() {
     return totalOrdersCreated;
 }
 
//Геттер для ID заказа
 public int getOrderId() {
     return this.orderId;
 }

 // Геттер для цены (чтобы увидеть результат в Main)
 public double getPrice() {
     return this.price;
 }
}