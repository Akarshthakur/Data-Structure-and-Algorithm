public class unaryoperators {
    //unary operators are used wiith one operands for eg ++ , --
    public static void main(String[] args) {
        int num = 5;
        System.out.println(++num);//6

        int a= 12, b=12;

        int res1, res2 ;
        System.out.println("value of a is :" +a);//12

        //increment 
        res1 = ++a;
        System.out.println(res1);//13

        //decrement 
        res2 = --b;
        System.out.println(res2);//11

        // + : unary plus;
        int var1 = 5, var2 = 5;

        // 5 is displayed then the var1 is increased by 6.
        System.out.println(var1++);//5

        // var2 is increased by 6 then var2 is displayed.
        System.out.println(++var2);//6

    }
    
}
