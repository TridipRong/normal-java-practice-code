public class EvenSum {
    public static void main(String[] args) {
        int[][] arrr={
                {5,3,4},
                {3,9,1},
                {2,4,6}
        };
        for(int i=0;i<arrr.length;i++){
            int sum=0;
            for(int j=0;j<arrr.length;j++){
                if(arrr[j][i]%2==0) {
                    sum = sum + arrr[j][i];
                }
            }
            System.out.println(sum);
        }
    }
}
