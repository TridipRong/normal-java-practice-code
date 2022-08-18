package Q1;

public class Main {
    void studentDetails(Student student){
        System.out.println("Student Name = "+Student.getName());
        System.out.println("Student Roll No. = "+Student.getRoll());
        System.out.println("Student Age = "+Student.getAge());
        System.out.println("Student Marks = "+Student.getMarks());
    }

    public static void main(String[] args) {
        //Non-parameterized
        Student student1=new Student();
        student1.setName("Tridip");
        student1.setRoll(1192);
        student1.setAge(21);
        student1.setMarks(88);

        //parameterized
        Student student2=new Student("Kousik",456,22,100);

        Main t=new Main();
        t.studentDetails(student1);
        t.studentDetails(student2);


    }
}
