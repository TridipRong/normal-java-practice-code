import java.util.Scanner;
public class Student {
    int roll;
    String studentN;
    int marks;
    public Student(){

    }
    public Student(int roll,String name,int marks){
        System.out.println("Roll Number: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of student:");
        int  n=sc.nextInt();
        System.out.println("-----------------------");
        for(int i=1;i<=n;i++){
            System.out.println("Put Roll Number: ");
            int roll= sc.nextInt();
            System.out.println("Put Your Name: ");
            String name=sc.next();
            System.out.println("Put Marks: ");
            int marks= sc.nextInt();
            System.out.println("Student Detail:"+i);
            Student student1= new Student(roll,name,marks);
        }
    }
}
