package Q1;
//Q1
public class Student implements java.io.Serializable{
    //Members variables
    private static int roll;
    private static String name;
    private static int age;
    private static int marks;

    public Student() {
    }
    public Student(String name, int roll, int age, int marks) {
    }

    //Setter method to det the values
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age>=18 && age<=60){
            this.age=age;
        }
    }
    public void setMarks(int marks){
        if(marks>=0 && marks<=500){
            this.marks=marks;
        }
    }

    //Getter method to get the values
    public static int getRoll(){
        return roll;
    }
    public static String getName(){
        return name;
    }
    public static int getAge(){
        return age;
    }
    public static int getMarks(){
        return marks;
    }

}