public class Student {
    private String name;
    private int marks;
    private int rank;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setRank(int rank) {
    this.rank = rank;
}

    public String getName() { return name; }
    public int getMarks() { return marks; }
}
