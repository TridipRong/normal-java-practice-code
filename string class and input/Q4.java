import java.util.Scanner;
public class Q4 {
    String str="";
    int posi;
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=input.next();

        System.out.println("Enter the position");
        int posi=input.nextInt();

        for(int i=0; i<str.length();i++){
            if(i==posi){
                System.out.println("Character at position is :"+ str.charAt(i));
            }
        }
    }
}
