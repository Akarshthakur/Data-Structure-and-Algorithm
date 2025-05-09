public class Patternproblem4 {
    public static void main(String[] args) {
        int n=4; 

        for(int frow = 1; frow<=2*n-1; frow++){
           
                System.out.print("*");
            }
            System.out.println();
            int trows= n-1;
            int stars =n-1;
            int spaces = 1; 

            for(int row=1;row<=trows; row++){
                //work
                for(int cst=1; cst<=stars; cst++){
                    System.out.print("*");
                }
                for(int csp=1; csp<=spaces; csp++){
                    System.out.print(" ");
                }
                for(int cst=1; cst<=stars; cst++){
                    System.out.print("*");
                }
                System.out.println();
                stars--;
                spaces += 2;
            }
        }
    }
    

