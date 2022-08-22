package Q1;
import java.util.Scanner;
public class Student {
    Scanner input = new Scanner(System.in);
    private int roll;
    private  String name;
    private int marks;
    private char grade;

    public Student() {
    }

    public  void displayDetails(){

        Student student1 = new Student();
        System.out.println("Enter roll");
        student1 .roll = input.nextInt();
        System.out.println("Enter marks");
        student1 .marks = input.nextInt();
        input.nextLine();
        System.out.println("Enter name");
        student1 .name = input.nextLine();
        System.out.println(student1.roll);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        System.out.println(caculateGrade());

    }

    private char caculateGrade(){
        if(marks>=500){
            return 'A';
        }
        else  if(marks<500 && marks>=400){
            return 'B';
        }
        else {
            return 'C';
        }
    }

    @Override
    public String toString() {
        return "Student{" +"roll=" + roll + ", name='" + name + '\'' +  ", marks=" + marks + ", grade=" + grade + '}';

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.displayDetails();
    }
}
