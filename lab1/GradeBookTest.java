package lab1;

import pr2.Student;
import java.util.*;

public class GradeBookTest { // Класс для запуска
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Course myCourse = new Course("CS101", "Object-oriented Programming", 3, "None");
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", "1"));
        students.add(new Student("B", "4"));
        students.add(new Student("D", "87"));
        // Добавь остальных по примеру

        GradeBook gb = new GradeBook(myCourse, students);
        gb.displayMessage();

        System.out.println("Please, input grades for students:");
        for (Student s : students) {
            System.out.print("Student " + s.getName() + ": ");
            gb.setGrade(s, sc.nextInt());
        }

        gb.displayGradeReport();
        sc.close();
    }
    
}