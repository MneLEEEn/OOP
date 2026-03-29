package problem2;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable{
	@Override
    public void eatPizza() {
        System.out.println("Student is eating pizza");
    }

    @Override
    public void retakeExam() {
        System.out.println("Student is retaking exam");
    }

    public void dance() {
        System.out.println("Student is dancing");
    }

    @Override
    public void move() {
        System.out.println("Student is moving");
    }
}
