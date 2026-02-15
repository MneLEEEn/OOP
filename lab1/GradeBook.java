package lab1;

import pr2.Student; // Импорт твоего класса из другого пакета
import java.util.*;

public class GradeBook {
    private Course course;
    private Map<Student, Integer> grades = new LinkedHashMap<>(); // Сохраняем порядок ввода

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        for (Student s : students) {
            grades.put(s, 0);
        }
    }

    public void setGrade(Student s, int grade) {
        grades.put(s, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();
        
        // Поиск макс/мин
        Student best = null;
        Student worst = null;

        for (Student s : grades.keySet()) {
            if (best == null || grades.get(s) > grades.get(best)) best = s;
            if (worst == null || grades.get(s) < grades.get(worst)) worst = s;
        }

        System.out.printf("\nClass average is %.2f. ", avg);
        System.out.println("Lowest grade is " + grades.get(worst) + " (Student " + worst.getName() + ", id: " + worst.getId() + ").");
        System.out.println("Highest grade is " + grades.get(best) + " (Student " + best.getName() + ", id: " + best.getId() + ").\n");
        
        outputBarChart();
    }

    public double determineClassAverage() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int g : grades.values()) sum += g;
        return (double) sum / grades.size();
    }

    public void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] frequency = new int[11];
        
        for (int grade : grades.values()) {
            frequency[grade == 100 ? 10 : grade / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            String label = (i == 10) ? "  100: " : String.format("%02d-%02d: ", i * 10, i * 10 + 9);
            System.out.print(label);
            for (int stars = 0; stars < frequency[i]; stars++) System.out.print("*");
            System.out.println();
        }
    }
}