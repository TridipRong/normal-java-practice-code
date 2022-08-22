package Q1;
import java.util.Scanner;
public class HistoryStudent extends AllStudents{
    int civ;
    int his;

    HistoryStudent(String name, String address) {

        super(name, address);
        getPercentage();
    }

    Scanner input = new Scanner(System.in);
    @Override
    public void getPercentage() {
        System.out.println("Name is "+this.name);
        System.out.println("Adress is "+this.address);

        System.out.println("Enter History marks");
        civ = input.nextInt();
        System.out.println("Enter Civ marks");
        his= input.nextInt();

        int result=((civ+his)*100)/200;
        System.out.println(result);
    }
}
