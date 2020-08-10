
import java.util.Scanner;

//import static java.lang.Math.pow;

class MyCalculator1 {
    /*
     * Create the method long power(int, int) here.
     */

    public long power(int a, int b) throws Exception
    {
        if (a==0 && b==0){
            throw new Exception("n and p should not be zero.");
        }
        else if(a<0 || b<0){
            throw new Exception("n or p should not be negative.");
        }
        else{
            return ((int)Math.pow(a, b));
        }
    }
}

public class  Exception_Handling2 {
    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
/*
3 5
2 4
0 0
-1 -2
-1 3
 */