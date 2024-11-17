
package studentmanagementsystem;

public class courseData {
    
    private String course;
    private String description;
    private String degree;
    
    public courseData(String course, String description, String degree){
        this.course = course;
        this.description = description;
        this.degree = degree;
    }
    public String getCourse(){
        return course;
    }
    public String getDescription(){
        return description;
    }
    public String getDegree(){
        return degree;
    }
    
}
