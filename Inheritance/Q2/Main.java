package Q2;

public class Main  {
    public static void main(String[] args) {

        Mamber e1=new Mamber();
        e1.Name="Tridip Rong";
        e1.Age=21;
        e1.PhoneNumber="9083392794";
        e1.Address="Kolkata";
        e1.Salary=40000;

        e1.allprint();
        e1.printSalary();

        Employee e2=new Employee();
        e2.Specialisation="acountence";
        e2.Department="acounts";
        System.out.println("Employee Details :-----");
        e2.employe();



        Maneger e3=new Maneger();
        e3.Specialisation="Softwere Devoloper";
        e3.Department="Computer Science";
        System.out.println("Manager Details :-----");

        e3.member();
    }

}
