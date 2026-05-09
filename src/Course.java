public class Course {

    private int courseId;
    private String courseCode;
    private String courseName;
    private int credits;

    private Department department;

    public Course(int courseId, String courseCode, String courseName,
                  int credits, Department department) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
    }
}
