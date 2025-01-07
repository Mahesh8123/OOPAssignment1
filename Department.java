public class Department {
    private String code;
    private String name;
    private String building;
    private int yearFounded;

    public Department(String code, String name, String building, int yearFounded) {
        this.code = code;
        this.name = name;
        this.building = building;
        this.yearFounded = yearFounded;
    }

    public String getCode() {
        return code;
    }
}