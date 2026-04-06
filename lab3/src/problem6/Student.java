package problem6;

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getOccupation() {
        return "Студент";
    }
}