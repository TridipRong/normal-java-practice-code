package Q4;

import java.util.Scanner;

public class NonStatic {
int n;
    public static void main(String[] args) {
        new NonStatic().output();
    }
    public void printResult(int n){
      if(n<0){
          System.out.println("Error");
      }
        if(n%2!=0){
            System.out.println(n);
        } else if (n%2==0) {
            n=n+(10-(n%10));
            System.out.println(n);
        }
    }
    private void output(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        printResult(n);
    }
}
