package Q4;

import java.util.Scanner;

public class Main  {
    static boolean isPrime(int n) {
        if (n == 1 || n == 0) return false;

        //Run a loop from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Test t=new Test();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Amount You Have");
        int p = input.nextInt();
        boolean u=isPrime(p);
        for (int i = 2; i <= p; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
