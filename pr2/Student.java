package pr2;

public class Student {
    private String name;
    private String id;
    private int yearOfStudy;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1; 
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void incrementYearOfStudy() {
        this.yearOfStudy++;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }
}
