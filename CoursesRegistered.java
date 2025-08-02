public class CoursesRegistered{
    
    
     public void viewcourses(Course course){
        System.out.println("You have registered to:"+ course.getCourseId()+" " + course.getCourseName() + "" + course.getCourseSlot());
    }

    public void addcourses(Course course){
        System.out.println("You have registered to:"+ course.getCourseId()+" " + course.getCourseName() + "" + course.getCourseSlot());
    }

    public void deletecourses(Course course){
        System.out.println("You have registered to:"+ course.getCourseId()+" " + course.getCourseName() + "" + course.getCourseSlot());
    }

}