package Q2;
import java.util.*;
public class Demo {

    public Hotel provideFood(int amount) {

        Hotel hotel = null;

        if(amount >= 1000)
            hotel = new TajHotel();
        else if(amount > 200 && amount < 1000)
            hotel= new RoadSideHotel();


        return hotel;

    }



    public static void main(String[] args) {


        Demo d1= new Demo();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Amount You Have");
        int amount=input.nextInt();
        Hotel h= d1.provideFood(amount);

        if( h != null) {
            h.chickenBiryani();
            h.masalaDosa();

            if(h instanceof TajHotel)
            {
                TajHotel taj= (TajHotel)h;
                taj.welcomeDrink();
            }
        }
        else
            System.out.println("Amount should be greater than 200");


    }
}
