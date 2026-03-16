package Problem5;

public class PetTest {
    public static void main(String[] args) {
   
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        
        Animal rex = new Dog("Rex", 3);
        Animal murka = new Cat("Murka", 5);

    
        System.out.println("--- Тест 1: PhD и Собака ---");
        alice.assignPet(rex); 
        
       
        john.assignPet(rex);
        System.out.println(john);

     
        System.out.println("\n--- Тест 2: Передача собаки PhD студенту ---");
        john.leavePetWith(alice);
        
   
        if (alice.hasPet()) {
            System.out.println("Алиса теперь присматривает за: " + alice.getPet().getName());
        } else {
            System.out.println("Алиса все еще без питомца (ограничение сработало).");
        }

 
        System.out.println("\n--- Тест 3: Передача кошки ---");
        Person student = new Student("Bob", 20, "Math");
        student.assignPet(murka);
        student.leavePetWith(alice); 
        
        System.out.println("Состояние Алисы: " + alice);
    }
}