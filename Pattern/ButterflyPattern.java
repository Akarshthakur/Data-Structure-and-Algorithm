public class ButterflyPattern {
    public static void main(String[] args) {
        int n=13;
        int trow=n;
        int stars= 1;
        int spaces = n-2;

        for(int row=1; row<=trow; row++){
            for(int cst=1;cst<=stars; cst++){
                System.out.print("*");
            }
            for(int csp=1; csp<=spaces; csp++){
                System.out.print(" ");
            }
            int sstar = stars;
            if (row==trow/2+1) {
                sstar=stars-1;
            }
            for(int cst=1; cst<=sstar;cst++){
                System.out.print("*");
            }
          System.out.println();
          if (row<=trow/2) {
            stars++;
          spaces -= 2;
          }
          else{
            stars--;
            spaces += 2;
          }
        }


    }
    
}
