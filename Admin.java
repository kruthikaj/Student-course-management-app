import java.util.*;
public class Admin extends Person {

    private String adminId;
    private List<Student> studentList; // Make sure this is set either via constructor or setter

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public void setStudentList(List<Student> students) {
        this.studentList = students;
    }

    public void AdminFlow() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome Admin! Please enter your name:");
        setName(scanner.nextLine());

        System.out.println("Enter your Admin ID:");
        setAdminId(scanner.nextLine());

        System.out.println("Type the student ID you want to view for the registered course:");
        String studentId = scanner.nextLine();

        boolean found = false;
        for (Student student : studentList) {
            if (student.getstudentId().equals(studentId)) {
                System.out.println("Courses registered by student " + studentId + ":");
                List<Course> courses = student.getRegisteredCourses();
                if (courses.isEmpty()) {
                    System.out.println("No courses registered yet.");
                } else {
                    for (Course course : courses) {
                        System.out.println("- " + course.getCourseName());
                    }
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }
}
