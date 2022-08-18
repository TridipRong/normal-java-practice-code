package day3;

public class SutudentObj {
    int roll=0;
    String name="";
    int marks=0;

    void student1(int RollNum,String UserName,int UserMarks){
        roll=RollNum;
        name=UserName;
        marks=UserMarks;
    }
    void displayStudentDetails(){
        System.out.println("\n Roll is:"+ roll);
        System.out.println("Name is:"+ name);
        System.out.println("Marks is:"+ roll);
    }

    public static void main(String[] args){
        SutudentObj Kousik=new SutudentObj();

        Kousik.student1(25,"Kousik Manik",80);

        SutudentObj Tridip=new SutudentObj();
        Tridip.student1(30,"Tridip Rong",85);

        Kousik.displayStudentDetails();

        System.out.println("---------\n");

        Tridip.displayStudentDetails();
    }
}
