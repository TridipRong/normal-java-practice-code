package day2;

public class SumOfNatural {
    static public int number(int N){
        return ((N * (N + 1)) / 2);
    }
    public static void main(String[] args){
        int sum=number(5);
        System.out.println(sum);
    }
}
