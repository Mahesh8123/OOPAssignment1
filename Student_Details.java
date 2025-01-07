public class Student_Details {
    private String studentId;
    private String name;
    private String mobileNumber;
    private String email;
    private String departmentCode;
    private String[] teacherCodes;

    public Student_Details(String studentId, String name, String mobileNumber, String email, String departmentCode,
            String[] teacherCodes) {
        this.studentId = studentId;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.departmentCode = departmentCode;
        this.teacherCodes = teacherCodes;
    }
}
