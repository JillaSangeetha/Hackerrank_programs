import java.util.Scanner;

public class  Lexicographical_order {

    public static String getSmallestAndLargest(String s, int k) {

        String temp="";
        String smallest = "";
        String largest = "";
        int slen=s.length();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int l=slen-k+1;

        String array[]=new String[l];
        for( int i=0;i<l;i++){
            array[i]=s.substring(i,i+k);
        }
        int n = array.length;
        System.out.println(l);
        System.out.println(n);
        for(int p=0;p<l-1;p++)
        {
            for(int u=p+1;u<l;u++)
            {
                if(array[u].compareTo(array[p])<0) //
                {
                    temp=array[p];
                    array[p]=array[u];
                    array[u]=temp;
                }

            }
        }
        smallest=array[0];
        largest=array[l-1];


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));


    }
}
/*output:
sangeetha
        2
        an
        th*/
/*
The Java String compareTo() method is used for comparing two strings lexicographically.Each character of both the strings
        is converted into a Unicode value for comparison. If both the strings are equal then
        this method returns 0 else it returns positive or negative value.
 The result is positive if the first string is lexicographically greater
 than the second string else the result would be negative */