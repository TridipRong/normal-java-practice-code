package eveluation;

public class Q3 {
    static class Lion{
        String name;
        boolean isHungry;
        int age;
        static int totalDeaths;
        static void printKillings(){
            System.out.println("Total killings by lions in jungle = "+totalDeaths);
        }
        void thinking(){
            if(isHungry==false){
                System.out.println(name+" is sleeping");
            }
            else if(isHungry==true && age>12){
                totalDeaths+=2;
                System.out.println(name+" has eaten two animal");
            }
            else if((isHungry==true)&& (age>=2 || age<=12)) {
                totalDeaths+=1;
                System.out.println(name+" has eaten one animal");
            } else if (isHungry==true || age<=2) {
                System.out.println(name+" is Calling Mom");

            }
        }
    }

    public static void main(String[] args) {
        Lion l1=new Lion();
        l1.name="Lion1";
        l1.isHungry=true;
        l1.age=14;
        l1.thinking();

        Lion l2=new Lion();
        l2.name="Lion2";
        l2.isHungry=false;
        l2.age=4;
        l2.thinking();

        Lion l3=new Lion();
        l3.name="Lion3";
        l3.isHungry=true;
        l3.age=1;
        l3.thinking();
        l3.printKillings();
    }
}
