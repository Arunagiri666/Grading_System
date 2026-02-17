import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Shakthi", 85));
        students.add(new Student("Arun", 92));
        students.add(new Student("Dinesh", 85));
        students.add(new Student("Kiran", 74));

        GradeCalculator calculator = new GradeCalculator();
        RankingService rankingService = new RankingService();

        rankingService.assignRanks(students);

        for (Student s : students) {
            String grade = calculator.calculateGrade(s.getMarks());
            System.out.println(
                s.getName() + " | Marks: " + s.getMarks() +
                " | Grade: " + grade +
                " | Rank: " + s.getRank()
            );
        }

        double avg = rankingService.calculateAverage(students);
        System.out.println("\nClass Average: " + avg);

        rankingService.printTopPerformers(students);
    }
}
