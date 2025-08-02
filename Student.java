import java.util.*;
public class Student extends Person{
    
    private String studentid;
    
    private List<Course> registeredCourses = new ArrayList<>();

    public String getstudentId(){
        return studentid;
    }

    public void setStudentId(String studentId){
        this.studentid= studentId;
    }
 
    CoursesRegistered courseManager = new CoursesRegistered();

    public void registerForCourse(Course course) {
        courseManager.addcourses(course);
    }

    public void viewRegisteredCourse(Course course) {
        courseManager.viewcourses(course);
    }

    public void addRegisteredCourse(Course course) {
        courseManager.addcourses(course);
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
        System.out.println("Student " + getstudentId() + " registered for " + course.getCourseName());
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

   public void StudentFlow() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome Student! Please enter your name:");
    setName(scanner.nextLine());

    System.out.println("Enter your student ID:");
    setStudentId(scanner.nextLine());

    System.out.println("Enter how many courses you want to register for:");
    int numCourses = scanner.nextInt();
    scanner.nextLine(); // consume leftover newline

    for (int i = 1; i <= numCourses; i++) {
        System.out.println("Enter Course ID for course " + i + ":");
        String courseId = scanner.nextLine();

        System.out.println("Enter Course Name for course " + i + ":");
        String courseName = scanner.nextLine();

        System.out.println("Enter Course Slot for course " + i + ":");
        String courseSlot = scanner.nextLine();

        // Create course object
        Course course = new Course();
        course.setCourseId(courseId);
        course.setCourseName(courseName);
        course.setCourseSlot(courseSlot);

        // Register the course
        addRegisteredCourse(course); // Uses CoursesRegistered internally
        registerCourse(course);      // Adds to registeredCourses list
    }

    System.out.println("\nCourses registered by " + getName() + ":");
    for (Course course : getRegisteredCourses()) {
        System.out.println("- " + course.getCourseName() + " (" + course.getCourseId() + ")");
    }
}


}
