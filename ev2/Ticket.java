import java.util.Scanner;
public class Ticket {
    int ticketid;
    int price;
    static int availableTickets;
    //int noofticket;

    public int calculateTicketcost(int nooftickets, int price){
        if(availableTickets>1){
            int totalAmount =nooftickets*price;
            return totalAmount;
        }else{
            return -1;
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int nex=sc.nextInt();
        System.out.println("Enter the available tickets:");
        availableTickets=sc.nextInt();
        System.out.println("         ");
        for(int i=1;i<=nex;i++){
            System.out.println("Enter the ticketid:");
            int id=sc.nextInt();

            System.out.println("Enter the price:");
            int price=sc.nextInt();

            System.out.println("Enter the no of tickets::");
            int ticket=sc.nextInt();

            System.out.println("availabele ticket:"+availableTickets);
            Ticket totalamount=new Ticket();
            int a = totalamount.calculateTicketcost(ticket,price);
            System.out.println("total amount:"+a);
            System.out.println("available tickets after boking:"+ (availableTickets-ticket));
        }

    }

}