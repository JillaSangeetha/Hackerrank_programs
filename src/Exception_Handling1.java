
import java.io.*;
        import java.util.*;

public class Exception_Handling1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);

        try{
            int a=scan.nextInt();
            int b=scan.nextInt();

            int c=a/b;
            System.out.println(c);
        }
        catch(InputMismatchException s){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
/*
 report in case of exceptions.

Sample Input 0:
10
3

Sample Output 0:
3

Sample Input 1:
10
Hello

Sample Output 1:
java.util.InputMismatchException

Sample Input 2:
10
0

Sample Output 2:
java.lang.ArithmeticException: / by zero

Sample Input 3:
23.323
0

Sample Output 3:
java.util.InputMismatchException
 */