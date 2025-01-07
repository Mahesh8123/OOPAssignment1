public class Student_Marks {
    private String studentId;
    private int semester;
    private int[] marks;

    public Student_Marks(String studentId, int semester, int[] marks) {
        this.studentId = studentId;
        this.semester = semester;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / (double) marks.length;
    }

    public void displayMarks() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Semester: " + semester);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }
}
