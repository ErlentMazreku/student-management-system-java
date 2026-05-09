import java.util.List;

public class Department {

    private int departmentId;
    private String DeptCode;
    private String DeptName;

    private List<Student> students;
    private List<Course> courses;

    public Department(int departmentId, String deptCode, String deptName) {
        this.departmentId = departmentId;
        this.DeptCode = deptCode;
        this.DeptName = deptName;
    }

    public String getDeptName() {
        return DeptName;
    }
}
