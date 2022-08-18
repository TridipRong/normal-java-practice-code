package Q1;

abstract public class AllStudents {
    public AllStudents(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args){

        ScienceStudent sc =new ScienceStudent("Tridip","Kolkata");

        HistoryStudent sc1 =new HistoryStudent("Tiyasa","Howrah");

    }
    String name;
    String address;
    public  abstract void getPercentage();
}
