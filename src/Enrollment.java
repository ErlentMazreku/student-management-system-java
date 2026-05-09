import java.time.LocalDate;

public class Enrollment {

    private int enrollmentId;
    private Student student;
    private Course course;

    private LocalDate enrollDate;

    public Enrollment(int enrollmentId, Student student,
                      Course course, LocalDate enrollDate) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
        this.enrollDate = enrollDate;
    }

    public void showEnrollment() {
        System.out.println("Student enrolled successfully!");
    }
}
