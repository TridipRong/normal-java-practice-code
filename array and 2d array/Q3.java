import java.util.*;
public class Q3 {
    public static ArrayList<Integer> findAndReturnPrimeNumbers(int[] inputArray){
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        for(int j=0;j<inputArray.length;j++){
            boolean isPrime = true;
            for(int i=2; i<=inputArray[j]/2; i++) {

                if(inputArray[j] % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                if(inputArray[j] == 1) {
                } else {
                    arrlist.add(inputArray[j] );
                }
            }

        }

        if (arrlist.isEmpty()){
            System.out.println("No prime number");
        }
        else{
            System.out.println(arrlist);
        }
        return arrlist;
    }
    public static void main(String[] args){
        int[] arr= {4,6,8};
        ArrayList output=findAndReturnPrimeNumbers(arr);

        System.out.println(output);
    }
}
