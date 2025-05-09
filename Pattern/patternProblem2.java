public class patternProblem2 {
    public static void main(String[] args) {
        int n=5;
        int trows=n;
        int stars=1;
        for(int row=1; row<=trows; row++){
            //work of current row
            for(int cst=1; cst<=stars; cst++){
                System.out.print("*");
                
            }
            //prepration for next row
            System.out.println();
            if (row<=trows/2) {
                stars++;

            }
            else{
                stars--; 
            }
        }
    }
    
}
