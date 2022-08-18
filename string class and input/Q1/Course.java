package Q1;
import java.util.*;
public class Course {
    String courseName ;
    int courseFee ;
    int courseId ;
    void  displayCourseDetails(int courseId , String courseName , int courseFee){
        System.out.println("Student course ID "+courseId);
        System.out.println("Student coursename "+courseName);
        System.out.println("Student coursefee "+courseFee);
    }
    void authenticate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username");
        String  username= input.next();
        System.out.println("Enter Password");
        String  password= input.next();
        if((username.equals("Admin")) && (password.equals("1234")) ){
            System.out.println("Enter the CourseId :");
            int courseId= input.nextInt();
            System.out.println("Enter the Name :");
            String courseName =input.next();
            System.out.println("Enter the marks :");
            int courseFee=input.nextInt();
            Course student1=new Course();
            student1.displayCourseDetails(courseId,courseName,courseFee);
            }
        else{
            System.out.println("Invalid Username or password");
        }
    }
    public static void main(String[] args){

        int j=2;
        for(int i=0;i<j;i++) {

            Course stdetails = new Course();
            stdetails.authenticate();
            System.out.println("**************");
        }

    }
}
