public class primeNumber {

    public static void main(String[] args) {
        int n=11 ;

        int div=2;

        int flag=0;

        while (div <= n-1 ) {
            if (n%div ==0 ) {
                flag=1;
                break;  
            }
            div = div+1;
        }
        if (flag ==1 ) {
            System.out.println("Not prime number");
        }
        else{
            System.out.println("prime Number");
        }
        // for(int i=1;i<=10;i++){
        //     if (i==9) {
        //         break;
                
        //     }
        //     System.out.println(i);
        // }
    }
}
