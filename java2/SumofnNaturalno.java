public class SumofnNaturalno {
    public static void main(String[] args) {

        // initially the variable sum value is zero, one the for loop begins sum=sum+i; starts then the sum value is printes and re-updated. 

        int sum =0;
         int n = 1000;

         for(int i=1; i<=n; i++){
            sum = sum+i;
            
         }
         System.out.println(sum);
    }
    
}
