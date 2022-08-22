package Q2;
import java.util.Scanner;
public class avarageAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        avarageAge obj = new avarageAge();


        System.out.println("Enter total no.of employees:");
        int n = sc.nextInt();
        if(n>1){
            int[] age=new int[n];
            System.out.println("Enter the age for "+n+" employees:");
            for(int i=0;i<n;i++) {
                int temp=sc.nextInt();
                age[i] = temp;
            }
            double result = obj.calculateAverage(age);
            System.out.println("The average age is : " + result);
        }else{
            System.out.println("Please enter a valid employee count");
        }
    }

    double calculateAverage(int[] age){
        int length = age.length;
        double sum = 0 ;
        for(int i=0;i<age.length;i++){
            sum += age[i];
        }
        double average = sum/length;
        return average;
    }

}
