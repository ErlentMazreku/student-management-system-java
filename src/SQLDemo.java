
import java.time.LocalDate;

public class SQLDemo {
    static void main() {

        Department d1 = new Department
                (1, "CS", "Computer Science");

        Department d2 = new Department
                (2, "AI", "Artificial Intelligence");

        Department d3 = new Department
                (3, "DS", "Data Science");

        Department d4 = new Department
                (4, "ML", "Machine Learning");

        Department d5 = new Department
                (5, "WD", "Web Development");

        Department d6 = new Department
                (6, "SE", "Software Engineering");

        Department d7 = new Department
                (7, "IS", "Information Science");

        Department d8 = new Department
                (8, "CS", "Cyber Security");

        Department d9 = new Department
                (9, "PT", "Penetration Testing");

        Department d10 = new Department
                (10, "DO", "DevOps");

        Student student1 = new Student(
                1,
                "100001",
                "Erlent",
                "Mazreku",
                "erlentmazreku21@gmail.com",
                d1);

        Student student2 = new Student(
                2,
                "100002",
                "Yllka",
                "Mazreku",
                "yllkakastrati172@gmail.com",
                d2);

        Student student3 = new Student(
                3,
                "100003",
                "Albuna",
                "Kastrati",
                "albunakastrati@gmail.com",
                d3);

        Student student4 = new Student(
                4,
                "100004",
                "Alaya",
                "Kastrati",
                "alayakastrati@gmail.com",
                d4);

        Student student5 = new Student(
                5,
                "100005",
                "Oen",
                "Mazreku",
                "oenmazreku@gmail.com",
                d5);

        Student student6 = new Student(
                6,
                "100006",
                "Eris",
                "Mazreku",
                "erismazreku@gmail.com",
                d6);

        Student student7 = new Student(
                7,
                "100007",
                "Libade",
                "Elshani",
                "libadeelshani@gmail.com",
                d7);

        Student student8 = new Student(
                8,
                "100008",
                "Det",
                "Fejza",
                "detfejza@gmail.com",
                d8);

        Student student9 = new Student(
                9,
                "100009",
                "Ent",
                "Gjata",
                "entgjata@gmail.com",
                d9);

        Student student10 = new Student(
                10,
                "100010",
                "Eryla",
                "Mazreku",
                "erylamazreku@gmail.com",
                d10);

        Course course1 = new Course(
                1,
                "CE101",
                "Cacttus Education",
                9,
                d1);

        Course course2 = new Course(
                2,
                "OX102",
                "Oxford University",
                10,
                d2);

        Course course3 = new Course(
                3,
                "MIT103",
                "Massachusetts Institute of Tech",
                8,
                d3);

        Course course4 = new Course(
                4,
                "ICL104",
                "Imperial College London",
                7,
                d4);

        Course course5 = new Course(
                5,
                "HU105",
                "Harvard University",
                6,
                d5);

        Enrollment enrollment1 = new Enrollment(
                1,
                student1,
                course1,
                LocalDate.now());

        Enrollment enrollment2 = new Enrollment(
                2,
                student2,
                course2,
                LocalDate.now());

        Enrollment enrollment3 = new Enrollment(
                3,
                student3,
                course3,
                LocalDate.now());

        Enrollment enrollment4 = new Enrollment(
                4,
                student4,
                course4,
                LocalDate.now());

        Enrollment enrollment5 = new Enrollment(
                5,
                student5,
                course5,
                LocalDate.now());

        Enrollment enrollment6 = new Enrollment(
                6,
                student6,
                course1,
                LocalDate.now());

        Enrollment enrollment7 = new Enrollment(
                7,
                student7,
                course2,
                LocalDate.now());

        Enrollment enrollment8 = new Enrollment(
                8,
                student8,
                course3,
                LocalDate.now());

        Enrollment enrollment9 = new Enrollment(
                9,
                student9,
                course4,
                LocalDate.now());

        Enrollment enrollment10 = new Enrollment(
                10,
                student10,
                course5,
                LocalDate.now());


        // Display each student followed by their enrollment
        Student[] students = {student1, student2, student3, student4, student5, 
                             student6, student7, student8, student9, student10};
        Enrollment[] enrollments = {enrollment1, enrollment2, enrollment3, enrollment4, enrollment5,
                                   enrollment6, enrollment7, enrollment8, enrollment9, enrollment10};
        
        for (int i = 0; i < students.length; i++) {
            students[i].showStudent();
            enrollments[i].showEnrollment();
        }

    }
}
