package Problem5;

class Employee extends Person {
    private String jobTitle;
    public Employee(String name, int age, String job) { super(name, age); this.jobTitle = job; }
    @Override public String getOccupation() { return "Работа: " + jobTitle; }
}

class Student extends Person {
    private String major;
    public Student(String name, int age, String major) { super(name, age); this.major = major; }
    @Override public String getOccupation() { return "Студент (" + major + ")"; }
}

class PhDStudent extends Person {
    private String researchArea;
    public PhDStudent(String name, int age, String major, String research) { super(name, age); this.researchArea = research; }
    @Override public String getOccupation() { return "PhD Исследователь: " + researchArea; }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("Ошибка: PhD студенты слишком заняты для собак!");
        } else {
            super.assignPet(pet);
        }
    }
}