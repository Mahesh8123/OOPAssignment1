public class Main {
    public static void main(String[] args) {
        Teaching_Staff teacher1 = new Teaching_Staff("T001", "Alice Johnson", "PhD in CS", "01-06-2015", "CS");
        Teaching_Staff teacher2 = new Teaching_Staff("T002", "Bob Smith", "M.Tech in ME", "15-07-2018", "ME");

        Student_Details student1 = new Student_Details("S001", "John Doe", "1234567890", "john.doe@example.com", "CS",
                new String[] { "T001", "T002" });
        Student_Details student2 = new Student_Details("S002", "Jane Smith", "9876543210", "jane.smith@example.com",
                "ME", new String[] { "T002" });

        Student_Marks marks1 = new Student_Marks("S001", 1, new int[] { 85, 90, 78, 88 });
        Student_Marks marks2 = new Student_Marks("S002", 1, new int[] { 92, 76, 88, 95 });

        System.out.println("\nStudent 1 Marks:");
        marks1.displayMarks();

        System.out.println("\nStudent 2 Marks:");
        marks2.displayMarks();
    }
}
