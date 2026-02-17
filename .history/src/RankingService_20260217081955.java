import java.util.*;

public class RankingService {

    public void assignRanks(List<Student> students) {
        students.sort((s1, s2) -> s2.getMarks() - s1.getMarks());

        int rank = 1;
        for (int i = 0; i < students.size(); i++) {
            if (i > 0 && students.get(i).getMarks() != students.get(i - 1).getMarks()) {
                rank = i + 1;
            }
            students.get(i).setRank(rank);
        }
    }

    public double calculateAverage(List<Student> students) {
        int total = 0;
        for (Student s : students) {
            total += s.getMarks();
        }
        return (double) total / students.size();
    }

    public void printTopPerformers(List<Student> students) {
        System.out.println("\n--- Top Performers ---");
        for (int i = 0; i < Math.min(3, students.size()); i++) {
            Student s = students.get(i);
            System.out.println("Rank " + s.getRank() + " : " + s.getName());
        }
    }
}
