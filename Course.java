public class Course {
     
    private String CourseId;
    private String CourseName;
    private String CourseSlot;

    public String getCourseId(){
        return CourseId;
    }

    public void setCourseId(String CourseId){
        this.CourseId = CourseId;
    }

    public String getCourseName(){
        return CourseName;
    }

    public void setCourseName(String CourseName){
        this.CourseName = CourseName;
    }

    public String getCourseSlot(){
        return CourseSlot;
    }

    public void setCourseSlot(String CourseSlot){
        this.CourseSlot = CourseSlot;
    }

    public void getCourse(){
        System.out.println("Your courses are" + getCourseId()+ getCourseName() + getCourseSlot());
    }

}
