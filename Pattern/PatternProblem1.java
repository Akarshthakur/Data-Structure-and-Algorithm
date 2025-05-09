public class PatternProblem1 {
    public static void main(String[] args) {
        int n=3;
        int trows = n;
        int spaces= n-1;
        int stars = 1;
        //first row   
        for(int row=1; row<=trows; row++){
            //work for current row
 
            //spaces
            for(int csp=1; csp <= spaces; csp++ ){
                System.out.print( " ");
            }
            //stars
            for(int cst=1; cst<=stars; cst++){
                System.out.print("*");
            }
            //preperation for next row
            System.out.println();
            spaces--;
            stars = stars+2;
        }
    }
}
