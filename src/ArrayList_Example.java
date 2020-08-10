import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        ArrayList[] a = new ArrayList[n];

        for( int i=0;i<n;i++)
        {
            int d=scan.nextInt();
            a[i]=new ArrayList();
            for( int j=0;j<d;j++)
            {
               a[i].add(scan.nextInt());
            }
        }
        int q=scan.nextInt();
        for(int z=0;z<q;z++)
        {
            int x= scan.nextInt();
            int y= scan.nextInt();
                    try{
                        System.out.println(a[x-1].get(y-1));
                       }
                    catch(Exception e)
                    {
                        System.out.println("ERROR!");
                    }
        }
    }
}
/* this is input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
*/
/*  ths is output
74
52
37
ERROR!
ERROR!
 */