package Q1;
import java.util.Scanner;
import java.lang.*;
public class ScienceStudent extends AllStudents {
    int physicsMarks;
    int chemistryMarks;
    int  mathMarks;
    ScienceStudent(String name, String address) {
        super(name, address);
        getPercentage();
    }
    Scanner input = new Scanner(System.in);

    @Override
    public void getPercentage() {
        System.out.println("Name is "+this.name);
        System.out.println("Adress is "+this.address);
        System.out.println("Enter Physics marks");
        physicsMarks = input.nextInt();
        System.out.println("Enter Chemestry marks");
        chemistryMarks= input.nextInt();
        System.out.println("Enter Mathematics marks");
        mathMarks = input.nextInt();

        float result=((physicsMarks+chemistryMarks+mathMarks)*100)/300;

        //  System.out.println(physicsMarks+chemistryMarks+mathMarks/300*100);
        System.out.println(result);
    }
}
