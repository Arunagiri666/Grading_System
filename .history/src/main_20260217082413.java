import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Shakthi", 85);
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(s1.getMarks());

        System.out.println("Student: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
        System.out.println("Grade: " + grade);
    }
}
