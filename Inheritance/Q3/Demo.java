package Q3;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Number: ");
        int x = input.nextInt();
        int sum=0;
        Students s1 = new Students();
        for (int i = 0; i < x; i++) {
            System.out.println("Enter roll");
            int roll = input.nextInt();
            System.out.println("Enter Name");
            String nam = input.next();
            System.out.println("Enter Address");
            String address = input.next();
            System.out.println("Enter Marks");
            int mark=input.nextInt();
            sum+=mark;

            System.out.println("Roll is :- "+roll+" \n"+"Name is :- "+nam+"\n "+"Adress :-"+address+"\n"+"Marks:- "+mark+"\n");
        }
        int y=sum/x;
        System.out.println("The average of all student marks is "+y);

    }
}
