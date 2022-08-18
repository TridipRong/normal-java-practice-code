import java.util.Scanner;
public class Reverse {
    public static String reversString(String input){
        char[] arrr=input.toCharArray();
        String output="";
        for(int i=arrr.length-1;i>=0;i--){
            output+=arrr[i];
        }
        return output;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }
}
