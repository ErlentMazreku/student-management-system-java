import java.util.List;

public class Student {

    private int StudentId;
    private String studentNo;
    private String firstName;
    private String lastName;
    private String email;

    private Department department;

    private List<Payments> payments;

    public Student(int studentId, String studentNo,
                   String firstName, String lastName,
                   String email, Department department) {
        StudentId = studentId;
        this.studentNo = studentNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

    public void showStudent() {
        System.out.println(firstName + " " + lastName);
        System.out.println("Department: " + department.getDeptName());
    }
}
