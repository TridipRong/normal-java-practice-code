package day2;

public class SwitchCase {
    static public String City(String cit){
        if(cit=="Mumbai"){
            return "Financial city";
        } else if (cit=="Kolkata") {
            return "City of Joy";
        } else if (cit=="Delhi") {
            return "Capital of the country";
        } else if (cit=="Bangalore") {
            return "Cyber City";
        }else {
            return  "May be Other Indian City";
        }
    }


    public static void main(String[] args) {

        String c=City("Kolkata");
        System.out.println(c);

    }
}
