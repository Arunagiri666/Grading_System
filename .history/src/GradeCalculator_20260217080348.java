public class GradeCalculator {
    public String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 50) return "C";
        return "Fail";
    }
}
